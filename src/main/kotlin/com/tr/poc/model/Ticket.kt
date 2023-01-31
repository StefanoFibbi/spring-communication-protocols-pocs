package com.tr.poc.model

data class Ticket(
    val id: String,
    val title: String,
    val description: String?,
    val category: String,
    val issuer: User,
    val owner: Agent?,
)
