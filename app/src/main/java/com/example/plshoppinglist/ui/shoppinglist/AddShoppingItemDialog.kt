package com.example.plshoppinglist.ui.shoppinglist

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDialog
import com.example.plshoppinglist.R
import com.example.plshoppinglist.dao.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.dialog_add_shopping_item.*

//import com.example.plshoppinglist.databinding.DialogAddShoppingItemBinding
//import com.example.plshoppinglist.databinding.ShoppingItemBinding

class AddShoppingItemDialog(context: Context, var addDialogListener: AddDialogListener) : AppCompatDialog(context) {

    //private lateinit var binding: DialogAddShoppingItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = DialogAddShoppingItemBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.dialog_add_shopping_item)

        //binding.tvAdd.setOnClickListener {
        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()

            if(name.isEmpty() || amount.isEmpty()) {
                Toast.makeText(context, "Please enter all the information required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val item = ShoppingItem(name, amount.toInt())
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}