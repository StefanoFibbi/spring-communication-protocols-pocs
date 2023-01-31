//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: agent.proto

package com.tr.poc.grpc;

@kotlin.jvm.JvmName("-initializeagentsResponse")
inline fun agentsResponse(block: com.tr.poc.grpc.AgentsResponseKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.AgentsResponse =
  com.tr.poc.grpc.AgentsResponseKt.Dsl._create(com.tr.poc.grpc.AgentsResponse.newBuilder()).apply { block() }._build()
object AgentsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: com.tr.poc.grpc.AgentsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.tr.poc.grpc.AgentsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.tr.poc.grpc.AgentsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AgentProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
     val agent: com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAgentList()
      )
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     * @param value The agent to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAgent")
    fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.add(value: com.tr.poc.grpc.Agent) {
      _builder.addAgent(value)
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     * @param value The agent to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAgent")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.plusAssign(value: com.tr.poc.grpc.Agent) {
      add(value)
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     * @param values The agent to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAgent")
    fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.addAll(values: kotlin.collections.Iterable<com.tr.poc.grpc.Agent>) {
      _builder.addAllAgent(values)
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     * @param values The agent to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAgent")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.plusAssign(values: kotlin.collections.Iterable<com.tr.poc.grpc.Agent>) {
      addAll(values)
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     * @param index The index to set the value at.
     * @param value The agent to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAgent")
    operator fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.set(index: kotlin.Int, value: com.tr.poc.grpc.Agent) {
      _builder.setAgent(index, value)
    }
    /**
     * <code>repeated .com.tr.poc.grpc.Agent agent = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAgent")
    fun com.google.protobuf.kotlin.DslList<com.tr.poc.grpc.Agent, AgentProxy>.clear() {
      _builder.clearAgent()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.tr.poc.grpc.AgentsResponse.copy(block: com.tr.poc.grpc.AgentsResponseKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.AgentsResponse =
  com.tr.poc.grpc.AgentsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

