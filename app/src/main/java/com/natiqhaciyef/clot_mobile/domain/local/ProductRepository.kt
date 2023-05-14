package com.natiqhaciyef.clot_mobile.domain.local

import com.natiqhaciyef.clot_mobile.data.models.for_database.ProductModelForDB
import com.natiqhaciyef.clot_mobile.data.source.ProductDataSource


class ProductRepository(private var ds: ProductDataSource) {

    suspend fun getAllProducts() = ds.getAllProducts()

    suspend fun insertProduct(productModel: ProductModelForDB) = ds.insertProduct(productModel)

    suspend fun deleteProduct(productModel: ProductModelForDB) = ds.deleteProduct(productModel)
}