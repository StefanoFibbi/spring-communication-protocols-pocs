package com.tr.poc.graphql.controller

import com.tr.poc.model.User
import com.tr.poc.service.UserStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class UserController(
    private val userStorageService: UserStorageService
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @QueryMapping
    fun users(): Collection<User> {
        log.info("[UserController] All users")
        return userStorageService.allUsers()
    }

    @QueryMapping
    fun userById(@Argument id: String): User? {
        log.info("[UserController] Get user by id")
        return userStorageService.userById(id)
    }

    @MutationMapping
    fun createUser(@Argument firstName: String, @Argument lastName: String): User {
        log.info("[UserController] Create user")
        return userStorageService.createUser(firstName, lastName)
    }
}