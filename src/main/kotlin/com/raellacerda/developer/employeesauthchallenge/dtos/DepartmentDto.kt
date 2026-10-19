package com.raellacerda.developer.employeesauthchallenge.dtos

import jakarta.validation.constraints.NotBlank

data class DepartmentDto(
    val id: Long,
    @field:NotBlank
    val name: String
)
