package com.tr.poc.graphql.controller

import com.tr.poc.graphql.model.Agent
import com.tr.poc.graphql.model.Ticket
import com.tr.poc.graphql.model.User
import com.tr.poc.graphql.service.AgentStorageService
import com.tr.poc.graphql.service.TicketStorageService
import com.tr.poc.graphql.service.UserStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
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