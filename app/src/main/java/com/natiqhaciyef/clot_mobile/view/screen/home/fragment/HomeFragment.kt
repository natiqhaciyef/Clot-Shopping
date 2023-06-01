package com.natiqhaciyef.clot_mobile.view.screen.home.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.natiqhaciyef.clot_mobile.R
import com.natiqhaciyef.clot_mobile.data.models.ProductModel
import com.natiqhaciyef.clot_mobile.databinding.FragmentHomeBinding
import com.natiqhaciyef.clot_mobile.domain.objects.CategoriesList
import com.natiqhaciyef.clot_mobile.view.adapter.CategoryAdapter
import com.natiqhaciyef.clot_mobile.view.adapter.ProductAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var productAdapter: ProductAdapter
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val categories = mutableListOf("Women", "Men", "Kids", "Unisex")
        val adapter = ArrayAdapter(requireContext(), R.layout.drop_down_list_item, categories)
        binding.dropDownListElement.setAdapter(adapter)
        categoriesSetup()
    }

    private fun categoriesSetup() {
        categoryAdapter = CategoryAdapter(requireContext(), CategoriesList.categoriesForGirls)
        binding.recyclerViewTypeCategories.adapter = categoryAdapter
        binding.recyclerViewTypeCategories.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    fun productsSetup() {
        //        productAdapter = ProductAdapter(requireContext(), productList)
//        binding.recyclerViewProducts.adapter = productAdapter
//        binding.recyclerViewProducts.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
//        productAdapter.onClick { productModel ->
//            println(productModel)
//        }

    }
}