package com.tr.poc.service.impl

import com.tr.poc.model.Agent
import com.tr.poc.service.AgentStorageService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InMemoryAgentStorageService : AgentStorageService {
    private val log: Logger = LoggerFactory.getLogger(javaClass)
    private final val agents: MutableCollection<Agent>

    init {
        agents = mutableListOf(
            Agent(
                id = "AGENT-001",
                firstName = "Mario",
                lastName = "Rossi"
            ),
            Agent(
                id = "AGENT-002",
                firstName = "Fabio",
                lastName = "Biondi"
            )
        )
    }

    override fun allAgents(): Collection<Agent> {
        log.info("[AgentStorageService] Get all agents called")
        return agents
    }

    override fun agentById(id: String): Agent? {
        log.info("[AgentStorageService] Get agent by id ($id) called")
        return agents.firstOrNull { it.id == id }
    }
}