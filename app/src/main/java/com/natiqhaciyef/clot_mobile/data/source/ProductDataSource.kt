package com.natiqhaciyef.clot_mobile.data.source

import com.natiqhaciyef.clot_mobile.data.models.for_database.ProductModelForDB
import com.natiqhaciyef.clot_mobile.data.roomdb.dao.ProductDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductDataSource(private var dao: ProductDao) {

    suspend fun getAllProducts() = withContext(Dispatchers.IO){
        dao.getAllProducts()
    }

    suspend fun insertProduct(productModel: ProductModelForDB) = withContext(Dispatchers.IO){
        dao.insertProduct(productModel = productModel)
    }

    suspend fun deleteProduct(productModel: ProductModelForDB) = withContext(Dispatchers.IO){
        dao.deleteProduct(productModel = productModel)
    }

}