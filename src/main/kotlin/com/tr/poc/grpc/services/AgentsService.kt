package com.tr.poc.grpc.services

import com.tr.poc.grpc.Agent as AgentGrpc
import com.tr.poc.service.AgentStorageService
import com.tr.poc.grpc.AgentRequest
import com.tr.poc.grpc.AgentServiceGrpcKt
import com.tr.poc.grpc.AgentsRequest
import com.tr.poc.grpc.mappers.AgentMapper
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class AgentsService(
    val service: AgentStorageService,
) : AgentServiceGrpcKt.AgentServiceCoroutineImplBase() {
    override fun agents(request: AgentsRequest): Flow<AgentGrpc> {
        val agents = service.allAgents()
        return AgentMapper.agentsResponse(agents)
    }

    override suspend fun agentById(request: AgentRequest): AgentGrpc {
        val agent = service.agentById(request.id)
        return AgentMapper.agentResponse(agent)
    }
}