package com.kyotobytes.dinnerpicker

import android.text.Editable

class FoodList {
    private var list = arrayListOf<String>("Burger","Kachchi Biryani","Pizza","KFC", "BFC","Bhuna Khichuri", "Morog Polao", "Grilled Chicken", "Haleem", "Sheek Kabab")

    init {
        list = arrayListOf<String>("Burger","Kachchi Biryani","Pizza","KFC", "BFC","Bhuna Khichuri", "Morog Polao", "Grilled Chicken", "Haleem", "Sheek Kabab")
    }

    fun getItem(): String{
        var listSize=list.size
        if(listSize==0 ){
            return "List Empty..."
        }else{
            val rand=(0..listSize).random()
            return list[rand]
        }
    }
    fun clearList(){
        list.clear()
    }

    fun addItem(newItem: String?){
        if (newItem != null) {
            list.add(newItem)
        }
    }

    fun getRandomItem(): String{
        var listSize=list.size
        if(listSize==0 || listSize<1){
            return "List Empty..."
        }else{
            val rand=(0 until listSize).random()
            return list[rand]
        }
    }
}