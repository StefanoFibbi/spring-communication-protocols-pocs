package com.tr.poc.graphql.service.impl

import com.tr.poc.graphql.model.User
import com.tr.poc.graphql.service.UserStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InMemoryUserStorageService : UserStorageService {
    private val log: Logger = LoggerFactory.getLogger(javaClass)
    private final val users: MutableCollection<User>
    private final val ID_PREFIX = "USR"

    init {
        users = mutableListOf(
            User(
                id = "$ID_PREFIX-001",
                firstName = "Cesar",
                lastName = "WHOKNOWS"
            ),
            User(
                id = "$ID_PREFIX-002",
                firstName = "Stefano",
                lastName = "Fib"
            ),
            User(
                id = "$ID_PREFIX-003",
                firstName = "Dumb",
                lastName = "User"
            )
        )
    }

    override fun allUsers(): Collection<User> {
        log.info("[UserStorageService] Get all users called")
        return users
    }

    override fun userById(id: String): User? {
        log.info("[UserStorageService] Get user by id ($id) called")
        return users.firstOrNull { it.id == id }
    }

    override fun createUser(firstName: String, lastName: String): User =
        User(
            id = getNextUserId(),
            firstName = firstName,
            lastName = lastName
        ).also { users.add(it) }

    private fun getNextUserId(): String =
        users
            .lastOrNull()
            ?.let { lastUser ->
                val lastID = lastUser.id.split("$ID_PREFIX-")[1]
                val nextID = lastID.toInt() + 1
                "$ID_PREFIX-${nextID.toString().padStart(3, '0')}"
            }
            ?: "$ID_PREFIX-001"
}