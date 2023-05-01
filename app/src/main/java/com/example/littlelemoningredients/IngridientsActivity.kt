package com.example.littlelemoningredients

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IngridientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredients)

        findViewById<TextView>(R.id.ingredients_list).text =
            "<Your solution here>"
    }

    companion object {
        val EXTRA_DISH_NAME_KEY = "DishName"
        fun start(context: Context, dishName: String) {
            var intent =
                Intent(context, IngridientsActivity::class.java)
            intent.putExtra(EXTRA_DISH_NAME_KEY, dishName).apply {
                putExtra(EXTRA_DISH_NAME_KEY, dishName)
            }
            context.startActivity(intent)
        }
    }
}