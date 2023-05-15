package com.natiqhaciyef.clot_mobile.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natiqhaciyef.clot_mobile.data.models.ui_models.CategoryModel
import com.natiqhaciyef.clot_mobile.databinding.RecyclerCategoryItem2Binding

class CategoryAdapter2(val context: Context, val list: MutableList<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter2.CategoryHolder2>() {

    inner class CategoryHolder2(val binding: RecyclerCategoryItem2Binding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder2 {
        val binding = RecyclerCategoryItem2Binding.inflate(LayoutInflater.from(context), parent, false)
        return CategoryHolder2(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CategoryHolder2, position: Int) {
        val view = holder.binding
        val category = list[position]

        view.categoryImageView2.setImageResource(
            context.resources.getIdentifier(
                category.image,
                "drawable",
                context.packageName
            )
        )

        view.categoryTitleText2.text = category.title
    }
}