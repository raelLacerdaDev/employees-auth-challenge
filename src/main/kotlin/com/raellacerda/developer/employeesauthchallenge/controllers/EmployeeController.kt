package com.raellacerda.developer.employeesauthchallenge.controllers

import com.raellacerda.developer.employeesauthchallenge.dtos.EmployeeDto
import com.raellacerda.developer.employeesauthchallenge.services.EmployeeService
import jakarta.validation.Valid
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController(
    val service: EmployeeService
) {

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping
    fun findAll(pageable: Pageable): Page<EmployeeDto> {
        return service.findAll(pageable)
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping
    fun create(@RequestBody @Valid employeeDto: EmployeeDto): EmployeeDto {
        return service.create(employeeDto)
    }

}