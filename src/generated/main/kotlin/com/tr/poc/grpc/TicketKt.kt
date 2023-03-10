//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ticket.proto

package com.tr.poc.grpc;

@kotlin.jvm.JvmName("-initializeticket")
inline fun ticket(block: com.tr.poc.grpc.TicketKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.Ticket =
  com.tr.poc.grpc.TicketKt.Dsl._create(com.tr.poc.grpc.Ticket.newBuilder()).apply { block() }._build()
object TicketKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: com.tr.poc.grpc.Ticket.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.tr.poc.grpc.Ticket.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.tr.poc.grpc.Ticket = _builder.build()

    /**
     * <code>string id = 1;</code>
     */
    var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1;</code>
     */
    fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string title = 2;</code>
     */
    var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <code>string title = 2;</code>
     */
    fun clearTitle() {
      _builder.clearTitle()
    }

    /**
     * <code>string description = 3;</code>
     */
    var description: kotlin.String
      @JvmName("getDescription")
      get() = _builder.getDescription()
      @JvmName("setDescription")
      set(value) {
        _builder.setDescription(value)
      }
    /**
     * <code>string description = 3;</code>
     */
    fun clearDescription() {
      _builder.clearDescription()
    }

    /**
     * <code>string category = 4;</code>
     */
    var category: kotlin.String
      @JvmName("getCategory")
      get() = _builder.getCategory()
      @JvmName("setCategory")
      set(value) {
        _builder.setCategory(value)
      }
    /**
     * <code>string category = 4;</code>
     */
    fun clearCategory() {
      _builder.clearCategory()
    }

    /**
     * <code>.com.tr.poc.grpc.User issuer = 5;</code>
     */
    var issuer: com.tr.poc.grpc.User
      @JvmName("getIssuer")
      get() = _builder.getIssuer()
      @JvmName("setIssuer")
      set(value) {
        _builder.setIssuer(value)
      }
    /**
     * <code>.com.tr.poc.grpc.User issuer = 5;</code>
     */
    fun clearIssuer() {
      _builder.clearIssuer()
    }
    /**
     * <code>.com.tr.poc.grpc.User issuer = 5;</code>
     * @return Whether the issuer field is set.
     */
    fun hasIssuer(): kotlin.Boolean {
      return _builder.hasIssuer()
    }

    /**
     * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
     */
    var owner: com.tr.poc.grpc.Agent
      @JvmName("getOwner")
      get() = _builder.getOwner()
      @JvmName("setOwner")
      set(value) {
        _builder.setOwner(value)
      }
    /**
     * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
     */
    fun clearOwner() {
      _builder.clearOwner()
    }
    /**
     * <code>.com.tr.poc.grpc.Agent owner = 6;</code>
     * @return Whether the owner field is set.
     */
    fun hasOwner(): kotlin.Boolean {
      return _builder.hasOwner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.tr.poc.grpc.Ticket.copy(block: com.tr.poc.grpc.TicketKt.Dsl.() -> kotlin.Unit): com.tr.poc.grpc.Ticket =
  com.tr.poc.grpc.TicketKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val com.tr.poc.grpc.TicketOrBuilder.issuerOrNull: com.tr.poc.grpc.User?
  get() = if (hasIssuer()) getIssuer() else null

val com.tr.poc.grpc.TicketOrBuilder.ownerOrNull: com.tr.poc.grpc.Agent?
  get() = if (hasOwner()) getOwner() else null

