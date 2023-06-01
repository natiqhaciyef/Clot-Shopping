package com.natiqhaciyef.clot_mobile.domain.objects

import com.natiqhaciyef.clot_mobile.data.models.ui_models.CategoryModel

object CategoriesList {
    val categoriesForGirls = mutableListOf(
        CategoryModel(image = "category_1",title = "Clothing"),
        CategoryModel(image = "category_2",title = "Accessories"),
        CategoryModel(image = "category_3",title = "Beauty"),
        CategoryModel(image = "category_4",title = "Shoes")
    )

    val categoriesForBoys = mutableListOf(
        CategoryModel(image = "category_1",title = "Clothing"),
        CategoryModel(image = "category_2",title = "Accessories"),
        CategoryModel(image = "category_3",title = "Shoes"),
        CategoryModel(image = "category_4",title = "Suits"),
    )
}