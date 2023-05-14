package com.natiqhaciyef.clot_mobile.data.models.for_database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("product_table")
data class ProductModelForDB(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    var description: String,
    var images: String,
    var colors: String,
    var sizes: String,
    var price: Double,
    var rating: Double
)
