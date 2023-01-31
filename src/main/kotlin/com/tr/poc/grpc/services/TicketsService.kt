package com.tr.poc.grpc.services

import com.tr.poc.grpc.AgentRequest
import com.tr.poc.grpc.AgentServiceGrpcKt
import com.tr.poc.grpc.Ticket as TicketGrpc
import com.tr.poc.grpc.Agent as AgentGrpc
import com.tr.poc.grpc.User as UserGrpc
import com.tr.poc.grpc.TicketRequest
import com.tr.poc.grpc.TicketServiceGrpcKt
import com.tr.poc.grpc.TicketsRequest
import com.tr.poc.grpc.TicketsResponse
import com.tr.poc.grpc.UserRequest
import com.tr.poc.grpc.UserServiceGrpcKt
import com.tr.poc.grpc.mappers.TicketsMapper
import com.tr.poc.model.Ticket
import com.tr.poc.service.TicketStorageService
import org.springframework.stereotype.Service

@Service
class TicketsService(
    val service: TicketStorageService,
    val agentsGrpcService: AgentServiceGrpcKt.AgentServiceCoroutineImplBase,
    val usersGrpcService: UserServiceGrpcKt.UserServiceCoroutineImplBase,
) : TicketServiceGrpcKt.TicketServiceCoroutineImplBase() {
    override suspend fun tickets(request: TicketsRequest): TicketsResponse {
        val userReq = UserRequest.newBuilder().setId(request.issuer).build()
        val issuer = usersGrpcService.userById(userReq)

        val agentReq = AgentRequest.newBuilder().setId(request.owner).build()
        val owner = agentsGrpcService.agentById(agentReq)

        return TicketsMapper.ticketsResponse(service.allTickets())
    }

    override suspend fun ticketById(request: TicketRequest): TicketGrpc {
        return super.ticketById(request)
    }
}