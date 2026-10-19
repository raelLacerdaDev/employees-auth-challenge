package com.raellacerda.developer.employeesauthchallenge.services

import com.raellacerda.developer.employeesauthchallenge.dtos.UserDto
import com.raellacerda.developer.employeesauthchallenge.entities.Role
import com.raellacerda.developer.employeesauthchallenge.entities.User
import com.raellacerda.developer.employeesauthchallenge.mappers.toDto
import com.raellacerda.developer.employeesauthchallenge.repositories.UserRepository
import com.raellacerda.developer.employeesauthchallenge.services.exceptions.UserNotFound
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(private val repository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val result = repository.searchByEmail(username)
        if(result.isEmpty()) throw UserNotFound("User with username: $username not found!")

        val user = User(
            email = result[0].username,
            secretKey = result[0].password,
        )

        for (data in result) {
            user.addRole(Role(data.roleId, data.authority))
        }

        return user
    }
    fun authenticated() : User {
        val authentication = SecurityContextHolder.getContext().authentication
        val jwt = authentication?.principal as Jwt
        val email = jwt.getClaim<String>("username")
        val user = repository.findByEmail(email)
        return user.orElseThrow { UserNotFound("User not found!") }
    }

    @Transactional(readOnly = true)
    fun getMe () : UserDto {
        val user = authenticated()
        return user.toDto()
    }

}