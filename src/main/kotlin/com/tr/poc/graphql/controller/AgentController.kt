package com.tr.poc.graphql.controller

import com.tr.poc.graphql.model.Agent
import com.tr.poc.graphql.service.AgentStorageService
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
    fun fetchAllAgents(): Collection<Agent> {
        log.info("[AgentController] All agents")
        return agentStorageService.allAgents()
    }

    @QueryMapping
    fun agentById(@Argument id: String, @Argument name: String): Agent? {
        log.info("[AgentController] Get agent by id")
        return agentStorageService.agentById(id)
    }

    @SchemaMapping
    fun fullName(agent: Agent): String = "${agent.firstName} ${agent.lastName}"
}