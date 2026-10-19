package com.raellacerda.developer.employeesauthchallenge.mappers

import com.raellacerda.developer.employeesauthchallenge.dtos.DepartmentDto
import com.raellacerda.developer.employeesauthchallenge.entities.Department


fun Department.toDto() = DepartmentDto(
    id = id ?: 0L,
    name = name,
)