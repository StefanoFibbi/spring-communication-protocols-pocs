//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: user.proto

package com.tr.poc.grpc;

@kotlin.jvm.JvmName("-initializeusersRequest")
inline fun usersRequest(block: com.tr.poc.grpc.UsersRequestKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.UsersRequest =
  com.tr.poc.grpc.UsersRequestKt.Dsl._create(com.tr.poc.grpc.UsersRequest.newBuilder()).apply { block() }._build()
object UsersRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: com.tr.poc.grpc.UsersRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.tr.poc.grpc.UsersRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.tr.poc.grpc.UsersRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.tr.poc.grpc.UsersRequest.copy(block: com.tr.poc.grpc.UsersRequestKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.UsersRequest =
  com.tr.poc.grpc.UsersRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
