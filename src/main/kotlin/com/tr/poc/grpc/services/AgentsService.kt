package com.tr.poc.grpc.services

import com.tr.poc.model.Agent
import com.tr.poc.grpc.Agent as AgentGrpc
import com.tr.poc.service.AgentStorageService
import com.tr.poc.grpc.AgentRequest
import com.tr.poc.grpc.AgentServiceGrpcKt
import com.tr.poc.grpc.AgentsRequest
import com.tr.poc.grpc.AgentsResponse

object AgentMapper {
    fun agentsResponse(agents: Collection<Agent>) = AgentsResponse
        .newBuilder()
        .addAllAgent(agents.map { this.toGrpc(it) }.asIterable())
        .build()

    fun agentResponse(agent: Agent) = toGrpc(agent)

    private fun toGrpc(agent: Agent): AgentGrpc = AgentGrpc
        .newBuilder()
        .setId(agent.id)
        .setFirstName(agent.firstName)
        .setLastName(agent.lastName)
        .setFullName("${agent.firstName} ${agent.lastName}")
        .build()
}

class AgentsService(
    val service: AgentStorageService,
): AgentServiceGrpcKt.AgentServiceCoroutineImplBase() {
    override suspend fun agents(request: AgentsRequest): AgentsResponse {
        val agents = service.allAgents()
        return AgentMapper.agentsResponse(agents)
    }

    override suspend fun agentById(request: AgentRequest): com.tr.poc.grpc.Agent {
        val agent = service.agentById(request.id)
        return AgentMapper.agentResponse(agent)
    }
}