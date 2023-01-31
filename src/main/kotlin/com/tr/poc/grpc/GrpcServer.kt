package com.tr.poc.grpc

import com.tr.poc.grpc.interceptors.JwtInterceptor
import com.tr.poc.service.impl.InMemoryAgentStorageService
import com.tr.poc.grpc.services.AgentsService
import io.grpc.Server
import io.grpc.ServerBuilder
import org.springframework.stereotype.Service

class GrpcServer(
    val port: Int,

    private val server: Server = ServerBuilder
            .forPort(port)
            .addService(AgentsService(InMemoryAgentStorageService()))
            .intercept(JwtInterceptor())
            .build()
){
    fun start() {
        server.start()
    }

    fun awaitTermination() {
        server.awaitTermination()
    }
}
