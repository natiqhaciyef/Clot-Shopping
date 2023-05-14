package com.natiqhaciyef.clot_mobile.data.roomdb.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.natiqhaciyef.clot_mobile.data.models.for_database.ProductModelForDB


@Dao
interface ProductDao {

    @Query("SELECT * FROM product_table")
    suspend fun getAllProducts(): List<ProductModelForDB>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertProduct(productModel: ProductModelForDB)

    @Delete
    suspend fun deleteProduct(productModel: ProductModelForDB)
}