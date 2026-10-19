package com.raellacerda.developer.employeesauthchallenge.entities

import jakarta.persistence.*
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails


@Entity
@Table(name = "tb_user")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    var email: String,

    @Column(nullable = false)
    var secretKey: String,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tb_user_role",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    private val _roles: MutableSet<Role> = mutableSetOf()

) : UserDetails {

    val roles: List<Role>
        get() = _roles.toList()

    override fun getAuthorities(): Collection<GrantedAuthority> {
        return _roles
    }

    override fun getPassword(): String {
        return secretKey
    }

    override fun getUsername(): String {
        return email
    }

    fun addRole(role: Role) {
        _roles.add(role)
    }

    fun hasRole(name: String): Boolean {
        return _roles.any { it.name == name }
    }
}