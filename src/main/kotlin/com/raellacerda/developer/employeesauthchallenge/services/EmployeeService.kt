package com.raellacerda.developer.employeesauthchallenge.services

import com.raellacerda.developer.employeesauthchallenge.dtos.EmployeeDto
import com.raellacerda.developer.employeesauthchallenge.entities.Department
import com.raellacerda.developer.employeesauthchallenge.entities.Employee
import com.raellacerda.developer.employeesauthchallenge.mappers.toDto
import com.raellacerda.developer.employeesauthchallenge.repositories.DepartmentRepository
import com.raellacerda.developer.employeesauthchallenge.repositories.EmployeeRepository
import com.raellacerda.developer.employeesauthchallenge.services.exceptions.ResourceNotFound
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class EmployeeService (
    private val employeeRepository: EmployeeRepository,
    private val departmentRepository: DepartmentRepository
) {
    @Transactional(readOnly = true)
    fun findAll(pageable: Pageable) : Page<EmployeeDto> {
        return employeeRepository.findAll(pageable).map {
            it.toDto()
        }
    }

    @Transactional
    fun create(employeeDto: EmployeeDto): EmployeeDto {
        val department = departmentRepository.findById(employeeDto.department.id).orElseThrow {
            ResourceNotFound("Department not found")
        }
        val employee = Employee(
            name = employeeDto.name,
            email = employeeDto.email,
            department = Department(
                id = department.id,
                name = department.name
            )
        )
        return employeeRepository.save(employee).toDto()
    }

}