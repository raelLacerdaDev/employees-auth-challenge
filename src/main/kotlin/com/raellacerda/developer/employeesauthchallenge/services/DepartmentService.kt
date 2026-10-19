package com.raellacerda.developer.employeesauthchallenge.services

import com.raellacerda.developer.employeesauthchallenge.dtos.DepartmentDto
import com.raellacerda.developer.employeesauthchallenge.entities.Department
import com.raellacerda.developer.employeesauthchallenge.mappers.toDto
import com.raellacerda.developer.employeesauthchallenge.repositories.DepartmentRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class DepartmentService(private val repository: DepartmentRepository) {

    @Transactional(readOnly = true)
    fun findAll(pageable: Pageable) : Page<DepartmentDto> {
        return repository.findAll(pageable).map {
            it.toDto()
        }
    }

    @Transactional
    fun create(departmentDto: DepartmentDto): DepartmentDto {
        val department = Department(
            name = departmentDto.name,
        )
        return repository.save(department).toDto()
    }
}