package com.tr.poc.graphql.controller

import com.tr.poc.model.Agent
import com.tr.poc.model.Ticket
import com.tr.poc.model.User
import com.tr.poc.service.AgentStorageService
import com.tr.poc.service.UserStorageService
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class TicketSchemaController(
    private val userStorageService: UserStorageService,
    private val agentStorageService: AgentStorageService
) {
    @SchemaMapping
    fun issuer(ticket: Ticket): User? = userStorageService.userById(ticket.issuer)

    @SchemaMapping
    fun owner(ticket: Ticket): Agent? = ticket.owner?.let { agentStorageService.agentById(it) }

}