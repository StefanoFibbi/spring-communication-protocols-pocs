package com.tr.poc.service

import com.tr.poc.model.Ticket

interface TicketStorageService {
    fun allTickets(): Collection<Ticket>
    fun ticketById(id: String): Ticket?
}