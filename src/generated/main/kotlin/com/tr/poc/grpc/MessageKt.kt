//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: agent.proto

package com.tr.poc.grpc;

@kotlin.jvm.JvmName("-initializemessage")
inline fun message(block: com.tr.poc.grpc.MessageKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.Message =
  com.tr.poc.grpc.MessageKt.Dsl._create(com.tr.poc.grpc.Message.newBuilder()).apply { block() }._build()
object MessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: com.tr.poc.grpc.Message.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.tr.poc.grpc.Message.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.tr.poc.grpc.Message = _builder.build()

    /**
     * <code>string message = 1;</code>
     */
    var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <code>string message = 1;</code>
     */
    fun clearMessage() {
      _builder.clearMessage()
    }

    /**
     * <code>string timestamp = 2;</code>
     */
    var timestamp: kotlin.String
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>string timestamp = 2;</code>
     */
    fun clearTimestamp() {
      _builder.clearTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.tr.poc.grpc.Message.copy(block: com.tr.poc.grpc.MessageKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.Message =
  com.tr.poc.grpc.MessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

