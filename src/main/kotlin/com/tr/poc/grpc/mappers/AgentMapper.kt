package com.tr.poc.grpc.mappers

import com.tr.poc.model.Agent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import com.tr.poc.grpc.Agent as AgentGrpc

object AgentMapper {
    fun agentsResponse(agents: Collection<Agent>): Flow<AgentGrpc> = agents
        .map { this.agentResponse(it) }
        .asFlow()

    fun agentResponse(agent: Agent?): AgentGrpc = agent?.let { toGrpc(it) }
        ?: AgentGrpc.newBuilder().build()

    private fun toGrpc(agent: Agent): AgentGrpc = AgentGrpc
        .newBuilder()
        .setId(agent.id)
        .setFirstName(agent.firstName)
        .setLastName(agent.lastName)
        .setFullName("${agent.firstName} ${agent.lastName}")
        .build()
}