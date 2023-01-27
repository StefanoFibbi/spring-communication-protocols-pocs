package com.tr.poc.graphql.service

import com.tr.poc.graphql.model.Ticket

interface TicketStorageService {
    fun allTickets(): Collection<Ticket>
    fun ticketById(id: String): Ticket?
}