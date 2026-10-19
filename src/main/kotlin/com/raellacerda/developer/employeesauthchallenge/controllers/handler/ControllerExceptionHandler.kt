package com.raellacerda.developer.employeesauthchallenge.controllers.handler

import com.raellacerda.developer.employeesauthchallenge.services.exceptions.ResourceNotFound
import com.raellacerda.developer.employeesauthchallenge.services.exceptions.UserNotFound
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ProblemDetail
import org.springframework.http.ResponseEntity
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.net.URI



@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFound::class)
    fun resourceNotFoundHandler(e: ResourceNotFound, request: HttpServletRequest) : ResponseEntity<ProblemDetail> {
        val status = HttpStatus.NOT_FOUND.value()
        val problemDetail = ProblemDetail.forStatus(status)
        problemDetail.instance = URI.create(request.requestURI)
        problemDetail.detail = e.message
        return ResponseEntity.status(status).body(problemDetail)
    }

    @ExceptionHandler(UserNotFound::class)
    fun userNotFoundHandler(e: UserNotFound, request: HttpServletRequest) : ResponseEntity<ProblemDetail> {
        val status = HttpStatus.NOT_FOUND.value()
        val problemDetail = ProblemDetail.forStatus(status)
        problemDetail.instance = URI.create(request.requestURI)
        problemDetail.detail = e.message
        return ResponseEntity.status(status).body(problemDetail)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationExceptions(
        e: MethodArgumentNotValidException,
        request: HttpServletRequest
    ): ResponseEntity<ProblemDetail> {
        val status = HttpStatus.BAD_REQUEST.value()
        val problemDetail = ProblemDetail.forStatus(status)

        problemDetail.title = "Validation Error"
        problemDetail.detail = "There are Invalid Fields!"
        problemDetail.instance = URI.create(request.requestURI)

        val errors = mutableMapOf<String, String?>()
        for (error in e.bindingResult.allErrors) {
            val fieldName = (error as? FieldError)?.field ?: error.objectName
            val errorMessage = error.defaultMessage
            errors[fieldName] = errorMessage
        }
        problemDetail.setProperty("errors", errors)

        return ResponseEntity.status(status).body(problemDetail)
    }
}