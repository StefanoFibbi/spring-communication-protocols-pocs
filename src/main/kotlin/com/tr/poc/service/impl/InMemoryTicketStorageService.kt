package com.tr.poc.service.impl

import com.tr.poc.model.Agent
import com.tr.poc.model.Ticket
import com.tr.poc.model.User
import com.tr.poc.service.TicketStorageService
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
                issuer = User(
                    id = "USR-001",
                    firstName = "Cesar",
                    lastName = "WHOKNOWS"
                ),
                owner = null,
            ),
            Ticket(
                id = "TICKET-002",
                title = "",
                description = null,
                category = "Dummy category",
                issuer = User(
                    id = "USR-001",
                    firstName = "Cesar",
                    lastName = "WHOKNOWS"
                ),
                owner = Agent(
                    id = "AGENT-002",
                    firstName = "Fabio",
                    lastName = "Biondi"
                )
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