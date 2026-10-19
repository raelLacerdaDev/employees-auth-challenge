package com.raellacerda.developer.employeesauthchallenge.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.security.core.GrantedAuthority

@Entity
@Table(name = "tb_role")
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    var name: String,
) : GrantedAuthority {

    override fun getAuthority(): String {
        return name
    }
}