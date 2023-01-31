package com.tr.poc.service

import com.tr.poc.model.User

interface UserStorageService {
    fun allUsers(): Collection<User>
    fun userById(id: String): User?
    fun createUser(firstName: String, lastName: String): User
}