package com.example.plshoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.plshoppinglist.dao.ShoppingDatabase
import com.example.plshoppinglist.dao.repositories.ShoppingRepository
import com.example.plshoppinglist.ui.shoppinglist.ShoppingViewModel
import com.example.plshoppinglist.ui.shoppinglist.ShoppingViewModelFactory

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)

        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProviders.of(this).get(ShoppingViewModel::class.java)
    }
}