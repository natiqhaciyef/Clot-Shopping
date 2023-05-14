package com.natiqhaciyef.clot_mobile.data.models

data class ProductModel(
    var name: String,
    var description: String,
    var images: List<String>,
    var colors: List<String>,
    var sizes: List<String>,
    var price: Double,
    var rating: Double
)