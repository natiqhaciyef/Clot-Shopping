package com.natiqhaciyef.clot_mobile.data.roomdb

import com.natiqhaciyef.clot_mobile.data.models.ProductModel
import com.natiqhaciyef.clot_mobile.data.models.for_database.ProductModelForDB
import com.natiqhaciyef.clot_mobile.domain.util.toSQLiteMutableList
import com.natiqhaciyef.clot_mobile.domain.util.toSQLiteString


class DataConverter {
    fun ProductModel.convertToProductModelForDB() =
        ProductModelForDB(
            id = 0,
            name = this.name,
            description = this.description,
            images = this.images.toMutableList().toSQLiteString(),
            colors = this.colors.toMutableList().toSQLiteString(),
            sizes = this.sizes.toMutableList().toSQLiteString(),
            price = this.price,
            rating = this.rating
        )

    fun ProductModelForDB.convertToProductModel() =
        ProductModel(
            name = this.name,
            description = this.description,
            images = this.images.toSQLiteMutableList(),
            colors = this.colors.toSQLiteMutableList(),
            sizes = this.sizes.toSQLiteMutableList(),
            price = this.price,
            rating = this.rating
        )
}