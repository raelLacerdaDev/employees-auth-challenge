package com.raellacerda.developer.employeesauthchallenge.mappers

import com.raellacerda.developer.employeesauthchallenge.dtos.EmployeeDto
import com.raellacerda.developer.employeesauthchallenge.entities.Employee


fun Employee.toDto(): EmployeeDto = EmployeeDto(
    id = id ?: 0L,
    name = name,
    email = email,
    department = department.toDto(),
)