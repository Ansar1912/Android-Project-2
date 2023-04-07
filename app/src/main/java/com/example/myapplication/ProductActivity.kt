package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter.ProductAdapter
import com.example.myapplication.Models.Product

class ProductActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.productlist)
        var rvProduct=findViewById<RecyclerView>(R.id.rvProduct)
        rvProduct.adapter = ProductAdapter(getProducts())
    }

    private fun getProducts():MutableList<Product>{
        val products = mutableListOf<Product>()
        products.add(Product("Samsung A53",67000.00))
        products.add(Product("Samsung A54",77000.00))
        products.add(Product("Samsung A55",87000.00))
        products.add(Product("Samsung A56",57000.00))
        products.add(Product("Samsung A57",47000.00))
        products.add(Product("Samsung A58",97000.00))
        products.add(Product("Samsung A59",107000.00))
        return products
    }

}