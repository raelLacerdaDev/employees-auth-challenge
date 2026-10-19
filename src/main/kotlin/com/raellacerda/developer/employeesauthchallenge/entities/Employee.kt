package com.raellacerda.developer.employeesauthchallenge.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table


@Entity
@Table(name = "tb_employee")
class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    var name: String,
    @Column(nullable = false, unique = true)
    var email: String,

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    var department: Department
)