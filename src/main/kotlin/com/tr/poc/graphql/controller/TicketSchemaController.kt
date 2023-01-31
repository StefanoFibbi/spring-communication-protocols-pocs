package com.tr.poc.graphql.controller

import com.tr.poc.graphql.mappers.AgentMapper
import com.tr.poc.graphql.mappers.UserMapper
import com.tr.poc.graphql.model.AgentDto
import com.tr.poc.graphql.model.TicketDto
import com.tr.poc.graphql.model.UserDto
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
    fun issuer(ticket: TicketDto): UserDto? = userStorageService.userById(ticket.issuer).let {
        UserMapper.toUserDto(it)
    }

    @SchemaMapping
    fun owner(ticket: TicketDto): AgentDto? = ticket.owner?.let {
        agentStorageService.agentById(it).let { agent ->
            AgentMapper.toAgentDto(agent)
        }
    }

}