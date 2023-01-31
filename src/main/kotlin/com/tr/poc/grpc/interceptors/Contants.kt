package com.tr.poc.grpc.interceptors

import io.grpc.Context
import io.grpc.Metadata
import io.grpc.Metadata.ASCII_STRING_MARSHALLER


internal class Constant private constructor() {
    init {
        throw AssertionError()
    }

    companion object {
        const val BEARER_TYPE = "Bearer"
        val AUTHORIZATION_METADATA_KEY: Metadata.Key<String> = Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER)
        val CLIENT_ID_CONTEXT_KEY: Context.Key<String> = Context.key("clientId")
    }
}