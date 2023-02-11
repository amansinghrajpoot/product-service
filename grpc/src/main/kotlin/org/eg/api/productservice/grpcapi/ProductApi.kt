package org.eg.api.productservice.grpcapi

import org.eg.productapi.v1.ProductServiceGrpcKt
import org.eg.productapi.v1.getProductRequest
import org.eg.productapi.v1.getProductResponse
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class ProductApi: ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    override suspend fun getProduct(request: getProductRequest): getProductResponse {
        return super.getProduct(request)
    }


}