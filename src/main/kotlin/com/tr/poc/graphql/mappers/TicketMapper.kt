package com.tr.poc.graphql.mappers

import com.tr.poc.graphql.model.TicketDto
import com.tr.poc.model.Ticket

object TicketMapper {
    fun toTicketsDto(tickets: Collection<Ticket>): Collection<TicketDto> = tickets.map { toTicketDto(it)!! }

    fun toTicketDto(ticket: Ticket?): TicketDto? = ticket?.let {
        TicketDto(
            id = ticket.id,
            title = ticket.title,
            description = ticket.description,
            category = ticket.category,
            issuer = ticket.issuer.id,
            owner = ticket.owner?.id,
        )
    }
}