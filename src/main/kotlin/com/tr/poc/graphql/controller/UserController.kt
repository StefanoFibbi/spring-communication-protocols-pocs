package com.tr.poc.graphql.controller

import com.tr.poc.graphql.mappers.UserMapper
import com.tr.poc.graphql.model.UserDto
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
    fun users(): Collection<UserDto> {
        log.info("[UserController] All users")
        val users = userStorageService.allUsers()
        return UserMapper.toUsersDto(users)
    }

    @QueryMapping
    fun userById(@Argument id: String): UserDto? {
        log.info("[UserController] Get user by id")
        val user = userStorageService.userById(id)
        return UserMapper.toUserDto(user)
    }

    @MutationMapping
    fun createUser(@Argument firstName: String, @Argument lastName: String): UserDto {
        log.info("[UserController] Create user")
        val user = userStorageService.createUser(firstName, lastName)
        return UserMapper.toUserDto(user)!!
    }
}