package com.raellacerda.developer.employeesauthchallenge.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "tb_department")
class Department(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    @OneToMany(mappedBy = "department", cascade = [CascadeType.ALL])
    private val _employees: MutableSet<Employee> = mutableSetOf(),
) {
    val employees: List<Employee>
            get() = _employees.toList()

    fun addEmployee(employee: Employee) {
        _employees.add(employee)
    }
    fun removeEmployee(employee: Employee) {
        _employees.remove(employee)
    }
}