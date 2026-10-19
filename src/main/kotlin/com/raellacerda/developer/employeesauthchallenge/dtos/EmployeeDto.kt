package com.raellacerda.developer.employeesauthchallenge.dtos

import jakarta.validation.Valid
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


data class EmployeeDto(
    val id: Long,
    @field:NotBlank(message = "Name is required")
    val name: String,

    @field:Email(message = "Email must be valid!")
    val email: String,

    @field:NotNull
    @field:Valid
    val department: DepartmentDto
)