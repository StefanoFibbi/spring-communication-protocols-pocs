package com.tr.poc.grpc.mappers

import com.tr.poc.grpc.Ticket as TicketGrpc
import com.tr.poc.grpc.TicketsResponse
import com.tr.poc.model.Ticket

object TicketsMapper {
    fun ticketsResponse(tickets: Collection<Ticket>): TicketsResponse = TicketsResponse
        .newBuilder()
        .addAllTicket(tickets.map { this.toGrpc(it) }.asIterable())
        .build()

    fun ticket(ticket: Ticket?): TicketGrpc = ticket?.let {
        this.toGrpc(it)
    } ?: TicketGrpc.newBuilder().build()

    private fun toGrpc(ticket: Ticket): TicketGrpc = TicketGrpc
        .newBuilder()
        .setId(ticket.id)
        .setTitle(ticket.title)
        .setDescription(ticket.description)
        .setCategory(ticket.category)
        .build()
}