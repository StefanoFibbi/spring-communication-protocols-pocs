package com.tr.poc.grpc

fun main(args: Array<String>) {
    val server = GrpcServer(port = 8990)
    server.start()
    server.awaitTermination()
}