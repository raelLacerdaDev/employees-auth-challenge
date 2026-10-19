package com.raellacerda.developer.employeesauthchallenge.security.customgrant

import org.springframework.security.core.GrantedAuthority

class CustomUserAuthorities(
    val username: String,
    val authorities: List<GrantedAuthority>
)