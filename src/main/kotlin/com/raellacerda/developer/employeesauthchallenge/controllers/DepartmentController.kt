package com.raellacerda.developer.employeesauthchallenge.controllers

import com.raellacerda.developer.employeesauthchallenge.dtos.DepartmentDto
import com.raellacerda.developer.employeesauthchallenge.services.DepartmentService
import jakarta.validation.Valid
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/departments")
class DepartmentController(
    val departmentService: DepartmentService
) {

    @GetMapping
    fun findAll(pageable: Pageable) : Page<DepartmentDto> {
        return departmentService.findAll(pageable)
    }

    @PostMapping("/departments")
    fun create(@RequestBody @Valid departmentDto: DepartmentDto): DepartmentDto {
        return departmentService.create(departmentDto)
    }
}