package com.tr.poc.graphql.controller

import com.tr.poc.model.Ticket
import com.tr.poc.service.TicketStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class TicketController(
    private val ticketStorageService: TicketStorageService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @QueryMapping
    fun tickets(): Collection<Ticket> {
        log.info("[TicketController] All tickets")
        return ticketStorageService.allTickets()
    }

    @QueryMapping
    fun ticketById(@Argument id: String): Ticket? {
        log.info("[TicketController] Get tickets by id")
        return ticketStorageService.ticketById(id)
    }

}