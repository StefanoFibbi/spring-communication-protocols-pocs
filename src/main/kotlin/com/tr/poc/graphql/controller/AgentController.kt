package com.tr.poc.graphql.controller

import com.tr.poc.graphql.mappers.AgentMapper
import com.tr.poc.graphql.model.AgentDto
import com.tr.poc.service.AgentStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class AgentController(
    private val agentStorageService: AgentStorageService
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @QueryMapping(name = "agents")
    fun fetchAllAgents(): Collection<AgentDto> {
        log.info("[AgentController] All agents")
        val agents = agentStorageService.allAgents()
        return AgentMapper.toAgentsDto(agents)
    }

    @QueryMapping
    fun agentById(@Argument id: String, @Argument name: String): AgentDto? {
        log.info("[AgentController] Get agent by id")
        val agent = agentStorageService.agentById(id)
        return AgentMapper.toAgentDto(agent)
    }

    @SchemaMapping
    fun fullName(agentDto: AgentDto): String = "${agentDto.firstName} ${agentDto.lastName}"
}