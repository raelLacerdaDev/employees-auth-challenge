package com.raellacerda.developer.employeesauthchallenge.mappers

import com.raellacerda.developer.employeesauthchallenge.dtos.UserDto
import com.raellacerda.developer.employeesauthchallenge.entities.User

fun User.toDto(): UserDto = UserDto(
    id = id ?: 0L,
    email = email,
    roles = roles.map { it.toDto() }
)