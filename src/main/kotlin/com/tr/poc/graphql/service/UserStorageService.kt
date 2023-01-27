package com.tr.poc.graphql.service

import com.tr.poc.graphql.model.User

interface UserStorageService {
    fun allUsers(): Collection<User>
    fun userById(id: String): User?
    fun createUser(firstName: String, lastName: String): User
}