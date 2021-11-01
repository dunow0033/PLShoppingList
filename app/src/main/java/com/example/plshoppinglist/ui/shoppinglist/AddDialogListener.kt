package com.example.plshoppinglist.ui.shoppinglist

import com.example.plshoppinglist.dao.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}