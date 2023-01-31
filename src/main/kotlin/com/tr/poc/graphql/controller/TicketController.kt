package com.tr.poc.graphql.controller

import com.tr.poc.graphql.mappers.TicketMapper
import com.tr.poc.graphql.model.TicketDto
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
    fun tickets(): Collection<TicketDto> {
        log.info("[TicketController] All tickets")
        val tickets = ticketStorageService.allTickets()
        return TicketMapper.toTicketsDto(tickets)
    }

    @QueryMapping
    fun ticketById(@Argument id: String): TicketDto? {
        log.info("[TicketController] Get tickets by id")
        val ticket = ticketStorageService.ticketById(id)
        return TicketMapper.toTicketDto(ticket)
    }
}