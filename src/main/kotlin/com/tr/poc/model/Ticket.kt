package com.tr.poc.model

data class Ticket(
    val id: String,
    val title: String,
    val description: String?,
    val category: String,
    val issuer: String,
    val owner: String?,
    val post: Collection<Post>,
)
