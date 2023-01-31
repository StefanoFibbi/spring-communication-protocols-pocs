package com.tr.poc.grpc.services

import com.tr.poc.model.Agent
import com.tr.poc.grpc.Agent as AgentGrpc
import com.tr.poc.service.AgentStorageService
import com.tr.poc.grpc.AgentRequest
import com.tr.poc.grpc.AgentServiceGrpcKt
import com.tr.poc.grpc.AgentsRequest
import com.tr.poc.grpc.AgentsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map

object AgentMapper {
    fun agentsResponse(agents: Collection<Agent>): AgentsResponse = AgentsResponse
        .newBuilder()
        .addAllAgent(agents.map { this.toGrpc(it) }.asIterable())
        .build()

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

class AgentsService(
    val service: AgentStorageService,
): AgentServiceGrpcKt.AgentServiceCoroutineImplBase() {
    override fun agents(request: AgentsRequest): Flow<AgentGrpc> {
        return service.allAgents().map { AgentMapper.agentResponse(it) }.asFlow()
    }

    override suspend fun agentById(request: AgentRequest): AgentGrpc {
        val agent = service.agentById(request.id)
        return AgentMapper.agentResponse(agent)
    }
}