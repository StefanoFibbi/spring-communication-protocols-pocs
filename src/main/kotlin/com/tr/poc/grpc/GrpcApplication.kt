package com.tr.poc.grpc

import com.tr.poc.grpc.services.AgentsService
import com.tr.poc.service.AgentStorageService
import io.grpc.ServerBuilder
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.tr.poc"])
class GrpcApplication {
    @Bean
    fun run(agentsService: AgentStorageService): CommandLineRunner {
        return CommandLineRunner {
            val port = 8990
            val server = ServerBuilder
                .forPort(port)
                .addService(AgentsService(agentsService))
                //.intercept(JwtInterceptor())
                .build()
            server.start()
            server.awaitTermination()
        }
    }
}

fun main(args: Array<String>) {
    runApplication<GrpcApplication>(*args)
}