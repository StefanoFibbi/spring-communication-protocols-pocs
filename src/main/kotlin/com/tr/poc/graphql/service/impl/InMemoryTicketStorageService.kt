package com.tr.poc.graphql.service.impl

import com.tr.poc.graphql.model.Ticket
import com.tr.poc.graphql.service.TicketStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InMemoryTicketStorageService : TicketStorageService {
    private val log: Logger = LoggerFactory.getLogger(javaClass)
    private final val tickets: MutableCollection<Ticket>

    init {
        tickets = mutableListOf(
            Ticket(
                id = "TICKET-001",
                title = "",
                description = null,
                category = "Dummy category",
                issuer = "USR-001",
                owner = null,
                post = emptyList()
            ),
            Ticket(
                id = "TICKET-002",
                title = "",
                description = null,
                category = "Dummy category",
                issuer = "USR-001",
                owner = "AGENT-002",
                post = emptyList()
            ),
        )
    }

    override fun allTickets(): Collection<Ticket> {
        log.info("[TicketStorageService] Get all tickets called")
        return tickets
    }

    override fun ticketById(id: String): Ticket? {
        log.info("[TicketStorageService] Get ticket by id ($id) called")
        return tickets.firstOrNull { it.id == id }
    }
}