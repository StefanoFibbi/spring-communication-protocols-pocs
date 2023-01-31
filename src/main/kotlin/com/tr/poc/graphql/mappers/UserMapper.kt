package com.tr.poc.graphql.mappers

import com.tr.poc.graphql.model.UserDto
import com.tr.poc.model.User

object UserMapper {
    fun toUsersDto(users: Collection<User>): Collection<UserDto> = users.map { toUserDto(it)!! }

    fun toUserDto(user: User?): UserDto? = user?.let {
        UserDto(
            id = user.id,
            firstName = user.firstName,
            lastName = user.lastName,
        )
    }
}