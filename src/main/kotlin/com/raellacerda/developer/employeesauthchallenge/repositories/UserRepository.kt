package com.raellacerda.developer.employeesauthchallenge.repositories

import com.raellacerda.developer.employeesauthchallenge.entities.User
import com.raellacerda.developer.employeesauthchallenge.projections.UserDetailsProjection
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.Optional

interface UserRepository : JpaRepository<User, Long> {

    @Query(
        nativeQuery = true,
        value = """
        SELECT tb_user.email AS username, 
               tb_user.secret_key AS password, 
               tb_role.id AS roleId, 
               tb_role.name AS authority
        FROM tb_user
        INNER JOIN tb_user_role ON tb_user.id = tb_user_role.user_id
        INNER JOIN tb_role ON tb_role.id = tb_user_role.role_id
        WHERE tb_user.email = :email
    """
    )
    fun searchByEmail(@Param("email") email: String): List<UserDetailsProjection>

    fun findByEmail(email: String): Optional<User>
}