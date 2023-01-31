package com.tr.poc.graphql.mappers

import com.tr.poc.graphql.model.AgentDto
import com.tr.poc.model.Agent

object AgentMapper {
    fun toAgentsDto(agents: Collection<Agent>): Collection<AgentDto> = agents.map { toAgentDto(it)!! }

    fun toAgentDto(agent: Agent?): AgentDto? = agent?.let {
        AgentDto(
            id = agent.id,
            firstName = agent.firstName,
            lastName = agent.lastName,
        )
    }
}