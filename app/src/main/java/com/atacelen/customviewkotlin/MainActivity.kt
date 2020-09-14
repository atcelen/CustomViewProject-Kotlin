package com.atacelen.customviewkotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val foodNameList : ArrayList<String> = ArrayList()
    val priceList : ArrayList<Int> = ArrayList()
    val foodImagesList : ArrayList<Bitmap> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodNameList.add("Quattro Formaggi")
        foodNameList.add("Ravioli")
        foodNameList.add("Paella")
        foodNameList.add("Fondue")
        foodNameList.add("Sushi")

        priceList.add(20)
        priceList.add(17)
        priceList.add(23)
        priceList.add(25)
        priceList.add(15)

        foodImagesList.add(BitmapFactory.decodeResource(applicationContext.resources, R.drawable.quattroformaggi))
        foodImagesList.add(BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ravioli))
        foodImagesList.add(BitmapFactory.decodeResource(applicationContext.resources, R.drawable.paella))
        foodImagesList.add(BitmapFactory.decodeResource(applicationContext.resources, R.drawable.fondue))
        foodImagesList.add(BitmapFactory.decodeResource(applicationContext.resources, R.drawable.sushi))

        val menuAdapter : MenuAdapterClass = MenuAdapterClass(foodNameList, priceList, foodImagesList, this)
        listView.adapter = menuAdapter


    }
}