package com.raellacerda.developer.employeesauthchallenge.repositories

import com.raellacerda.developer.employeesauthchallenge.entities.Department
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentRepository : JpaRepository<Department, Long>