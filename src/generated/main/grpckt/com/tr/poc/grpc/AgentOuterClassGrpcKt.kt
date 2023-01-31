package com.tr.poc.grpc

import com.tr.poc.grpc.AgentServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for com.tr.poc.grpc.AgentService.
 */
public object AgentServiceGrpcKt {
  public const val SERVICE_NAME: String = AgentServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = AgentServiceGrpc.getServiceDescriptor()

  public val agentsMethod: MethodDescriptor<AgentsRequest, Agent>
    @JvmStatic
    get() = AgentServiceGrpc.getAgentsMethod()

  public val agentByIdMethod: MethodDescriptor<AgentRequest, Agent>
    @JvmStatic
    get() = AgentServiceGrpc.getAgentByIdMethod()

  public val conversationMethod: MethodDescriptor<ConversationRequest, Message>
    @JvmStatic
    get() = AgentServiceGrpc.getConversationMethod()

  public val conversationListenerMethod: MethodDescriptor<ConversationListenerRequest, Message>
    @JvmStatic
    get() = AgentServiceGrpc.getConversationListenerMethod()

  /**
   * A stub for issuing RPCs to a(n) com.tr.poc.grpc.AgentService service as suspending coroutines.
   */
  @StubFor(AgentServiceGrpc::class)
  public class AgentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AgentServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): AgentServiceCoroutineStub
        = AgentServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun agents(request: AgentsRequest, headers: Metadata = Metadata()): Flow<Agent> =
        serverStreamingRpc(
      channel,
      AgentServiceGrpc.getAgentsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun agentById(request: AgentRequest, headers: Metadata = Metadata()): Agent =
        unaryRpc(
      channel,
      AgentServiceGrpc.getAgentByIdMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun conversation(requests: Flow<ConversationRequest>, headers: Metadata = Metadata()):
        Flow<Message> = bidiStreamingRpc(
      channel,
      AgentServiceGrpc.getConversationMethod(),
      requests,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun conversationListener(request: ConversationListenerRequest, headers: Metadata =
        Metadata()): Flow<Message> = serverStreamingRpc(
      channel,
      AgentServiceGrpc.getConversationListenerMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the com.tr.poc.grpc.AgentService service based on Kotlin coroutines.
   */
  public abstract class AgentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for com.tr.poc.grpc.AgentService.agents.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun agents(request: AgentsRequest): Flow<Agent> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.AgentService.agents is unimplemented"))

    /**
     * Returns the response to an RPC for com.tr.poc.grpc.AgentService.agentById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun agentById(request: AgentRequest): Agent = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.AgentService.agentById is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for com.tr.poc.grpc.AgentService.conversation.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    public open fun conversation(requests: Flow<ConversationRequest>): Flow<Message> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.AgentService.conversation is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * com.tr.poc.grpc.AgentService.conversationListener.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun conversationListener(request: ConversationListenerRequest): Flow<Message> =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.AgentService.conversationListener is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = AgentServiceGrpc.getAgentsMethod(),
      implementation = ::agents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AgentServiceGrpc.getAgentByIdMethod(),
      implementation = ::agentById
    ))
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = AgentServiceGrpc.getConversationMethod(),
      implementation = ::conversation
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = AgentServiceGrpc.getConversationListenerMethod(),
      implementation = ::conversationListener
    )).build()
  }
}
