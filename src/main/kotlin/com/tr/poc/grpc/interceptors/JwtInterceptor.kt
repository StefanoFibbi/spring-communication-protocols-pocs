package com.tr.poc.grpc.interceptors

import io.grpc.Context
import io.grpc.Contexts
import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import io.grpc.Status
import java.util.UUID

class JwtInterceptor: ServerInterceptor {
    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        call: ServerCall<ReqT, RespT>?,
        headers: Metadata?,
        next: ServerCallHandler<ReqT, RespT>?
    ): ServerCall.Listener<ReqT> {
        val value: String? = headers?.get(Constant.AUTHORIZATION_METADATA_KEY)

        var status: Status = Status.OK
        if (value == null) {
            status = Status.UNAUTHENTICATED.withDescription("Authorization token is missing")
        } else if (!value.startsWith(Constant.BEARER_TYPE)) {
            status = Status.UNAUTHENTICATED.withDescription("Unknown authorization type")
        } else {
            // Use JwtService to authenticate
            // handle the token validation
            val valid = true
            val id = UUID.randomUUID().toString()

            if (valid) {
                val ctx: Context = Context.current()
                    .withValue(Constant.CLIENT_ID_CONTEXT_KEY, id)
                return Contexts.interceptCall(ctx, call, headers, next)
            }
        }

        call?.close(status, Metadata())
        return object : ServerCall.Listener<ReqT>() { // noop
        }
    }
}