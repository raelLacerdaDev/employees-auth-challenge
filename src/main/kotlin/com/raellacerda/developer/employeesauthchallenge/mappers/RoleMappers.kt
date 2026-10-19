package com.raellacerda.developer.employeesauthchallenge.mappers

import com.raellacerda.developer.employeesauthchallenge.dtos.RoleDto
import com.raellacerda.developer.employeesauthchallenge.entities.Role

fun Role.toDto(): RoleDto = RoleDto(
    id = id ?: 0L,
    name = name
)