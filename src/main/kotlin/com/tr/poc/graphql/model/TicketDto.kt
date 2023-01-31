package com.tr.poc.graphql.model

data class TicketDto(
    val id: String,
    val title: String,
    val description: String?,
    val category: String,
    val issuer: String,
    val owner: String?,
)
