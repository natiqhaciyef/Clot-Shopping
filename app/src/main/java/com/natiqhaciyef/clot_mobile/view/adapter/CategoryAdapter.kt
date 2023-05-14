package com.natiqhaciyef.clot_mobile.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.natiqhaciyef.clot_mobile.data.models.ui_models.CategoryModel
import com.natiqhaciyef.clot_mobile.databinding.RecyclerCategoryItemBinding

class CategoryAdapter(val context: Context, val list: MutableList<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    inner class CategoryHolder(val binding: RecyclerCategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val binding = RecyclerCategoryItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CategoryHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val view = holder.binding
        val category = list[position]

//        Glide.with(context).load(category.image).into(view.categoryImageView)
        view.categoryTitleText.text = category.title

    }
}