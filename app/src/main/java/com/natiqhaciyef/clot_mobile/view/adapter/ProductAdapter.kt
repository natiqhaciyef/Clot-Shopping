package com.natiqhaciyef.clot_mobile.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.natiqhaciyef.clot_mobile.data.models.ProductModel
import com.natiqhaciyef.clot_mobile.databinding.RecyclerProductItemBinding

class ProductAdapter(val context: Context, val list: MutableList<ProductModel>) :
    RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    var productOnClick: ((ProductModel) -> Unit)? = null

    inner class ProductHolder(var binding: RecyclerProductItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val binding =
            RecyclerProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val element = list[position]
        val view = holder.binding

//        Glide.with(context).load(element.images[0]).into(view.productImage)
        view.productName.text = element.name
        view.productPrice.text = "$${"%.2f".format(element.price)}"

        holder.itemView.setOnClickListener {
            productOnClick?.invoke(element)
        }
    }

    fun onClick(onClick: (ProductModel) -> Unit) {
        productOnClick = onClick
    }
}