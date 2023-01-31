package com.tr.poc.grpc

import com.tr.poc.grpc.TicketServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for com.tr.poc.grpc.TicketService.
 */
public object TicketServiceGrpcKt {
  public const val SERVICE_NAME: String = TicketServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = TicketServiceGrpc.getServiceDescriptor()

  public val ticketsMethod: MethodDescriptor<TicketsRequest, TicketsResponse>
    @JvmStatic
    get() = TicketServiceGrpc.getTicketsMethod()

  public val ticketByIdMethod: MethodDescriptor<TicketRequest, Ticket>
    @JvmStatic
    get() = TicketServiceGrpc.getTicketByIdMethod()

  /**
   * A stub for issuing RPCs to a(n) com.tr.poc.grpc.TicketService service as suspending coroutines.
   */
  @StubFor(TicketServiceGrpc::class)
  public class TicketServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TicketServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        TicketServiceCoroutineStub = TicketServiceCoroutineStub(channel, callOptions)

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
    public suspend fun tickets(request: TicketsRequest, headers: Metadata = Metadata()):
        TicketsResponse = unaryRpc(
      channel,
      TicketServiceGrpc.getTicketsMethod(),
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
    public suspend fun ticketById(request: TicketRequest, headers: Metadata = Metadata()): Ticket =
        unaryRpc(
      channel,
      TicketServiceGrpc.getTicketByIdMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the com.tr.poc.grpc.TicketService service based on Kotlin
   * coroutines.
   */
  public abstract class TicketServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.tr.poc.grpc.TicketService.tickets.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun tickets(request: TicketsRequest): TicketsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.TicketService.tickets is unimplemented"))

    /**
     * Returns the response to an RPC for com.tr.poc.grpc.TicketService.ticketById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun ticketById(request: TicketRequest): Ticket = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.tr.poc.grpc.TicketService.ticketById is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TicketServiceGrpc.getTicketsMethod(),
      implementation = ::tickets
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TicketServiceGrpc.getTicketByIdMethod(),
      implementation = ::ticketById
    )).build()
  }
}
