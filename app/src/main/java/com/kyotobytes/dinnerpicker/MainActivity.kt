package com.kyotobytes.dinnerpicker

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var food = FoodList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        food= FoodList()
        SetItem()
    }

    fun SetItem(){
        val selectedFood = findViewById<TextView>(R.id.SelectedFoodText) as TextView
        selectedFood.text = food.getItem()
    }

    fun ClearList(view: View) {
        food.clearList()
        SetItem()
    }

    fun AddItem(view: View) {
        val input:EditText = findViewById<EditText>(R.id.newItem) as EditText
        val foodName: String = input.text.toString()
        if(!TextUtils.isEmpty(input.text.toString())){
            food.addItem(foodName)
            SetItem()
            input.hint="Enter food name here...".toString()
        }else{
            input.hint="wrong input"
        }

    }

    fun Decide(view: View) {
        val selectedFood:TextView = findViewById<TextView>(R.id.SelectedFoodText) as TextView
        selectedFood.text = food.getRandomItem().toString()
    }
}