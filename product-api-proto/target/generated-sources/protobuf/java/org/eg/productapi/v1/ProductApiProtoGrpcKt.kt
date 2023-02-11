package org.eg.productapi.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import org.eg.productapi.v1.ProductServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for org.eg.productapi.v1.ProductService.
 */
object ProductServiceGrpcKt {
  const val SERVICE_NAME: String = ProductServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ProductServiceGrpc.getServiceDescriptor()

  val getProductMethod: MethodDescriptor<getProductRequest, getProductResponse>
    @JvmStatic
    get() = ProductServiceGrpc.getGetProductMethod()

  /**
   * A stub for issuing RPCs to a(n) org.eg.productapi.v1.ProductService service as suspending
   * coroutines.
   */
  @StubFor(ProductServiceGrpc::class)
  class ProductServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ProductServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProductServiceCoroutineStub =
        ProductServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getProduct(request: getProductRequest, headers: Metadata = Metadata()):
        getProductResponse = unaryRpc(
      channel,
      ProductServiceGrpc.getGetProductMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the org.eg.productapi.v1.ProductService service based on Kotlin
   * coroutines.
   */
  abstract class ProductServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for org.eg.productapi.v1.ProductService.getProduct.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getProduct(request: getProductRequest): getProductResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.eg.productapi.v1.ProductService.getProduct is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProductServiceGrpc.getGetProductMethod(),
      implementation = ::getProduct
    )).build()
  }
}
