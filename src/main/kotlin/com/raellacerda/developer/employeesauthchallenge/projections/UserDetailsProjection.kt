package com.raellacerda.developer.employeesauthchallenge.projections

import java.time.LocalDate

interface UserDetailsProjection {
    val username: String
    val password: String
    val roleId : Long
    val authority : String
}