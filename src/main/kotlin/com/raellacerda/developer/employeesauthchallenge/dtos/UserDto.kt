package com.raellacerda.developer.employeesauthchallenge.dtos

data class UserDto(
    val id: Long,
    val email: String,
    val roles: List<RoleDto>
)
