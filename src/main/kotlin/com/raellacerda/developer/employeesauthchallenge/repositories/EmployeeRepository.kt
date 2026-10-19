package com.raellacerda.developer.employeesauthchallenge.repositories

import com.raellacerda.developer.employeesauthchallenge.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long>