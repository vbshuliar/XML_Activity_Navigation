package com.example.littlelemoningredients

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
}