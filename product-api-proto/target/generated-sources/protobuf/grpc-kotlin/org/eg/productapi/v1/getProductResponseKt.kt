//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: org/eg/productapi/productapi.proto

package org.eg.productapi.v1;

@kotlin.jvm.JvmName("-initializegetProductResponse")
inline fun getProductResponse(block: org.eg.productapi.v1.getProductResponseKt.Dsl.() -> kotlin.Unit): org.eg.productapi.v1.getProductResponse =
  org.eg.productapi.v1.getProductResponseKt.Dsl._create(org.eg.productapi.v1.getProductResponse.newBuilder()).apply { block() }._build()
object getProductResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: org.eg.productapi.v1.getProductResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.eg.productapi.v1.getProductResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.eg.productapi.v1.getProductResponse = _builder.build()

    /**
     * <code>string product = 1;</code>
     */
    var product: kotlin.String
      @JvmName("getProduct")
      get() = _builder.getProduct()
      @JvmName("setProduct")
      set(value) {
        _builder.setProduct(value)
      }
    /**
     * <code>string product = 1;</code>
     */
    fun clearProduct() {
      _builder.clearProduct()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun org.eg.productapi.v1.getProductResponse.copy(block: org.eg.productapi.v1.getProductResponseKt.Dsl.() -> kotlin.Unit): org.eg.productapi.v1.getProductResponse =
  org.eg.productapi.v1.getProductResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

