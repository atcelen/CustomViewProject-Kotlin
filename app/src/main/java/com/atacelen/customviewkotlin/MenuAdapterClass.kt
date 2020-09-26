package com.atacelen.customviewkotlin

import android.app.Activity
import android.graphics.Bitmap
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.custom_view.view.*

class MenuAdapterClass(private val foodNameList : ArrayList<String>, private val priceList : ArrayList<Int>, private val foodImagesList : ArrayList<Bitmap>, private val context : Activity) :
    ArrayAdapter<String>(context, R.layout.custom_view, foodNameList) {

    /*
        The "getView" method displays the data at the specified position in the data set.
        You can either create a View manually or inflate it from an XML layout file.

        https://developer.android.com/reference/kotlin/android/widget/Adapter
    */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = context.layoutInflater
        val customView = layoutInflater.inflate(R.layout.custom_view, null, true)

        customView.custom_view_foodNameText.text = foodNameList.get(position).toString()
        customView.custom_view_priceText.text = priceList.get(position).toString() + " CHF"
        customView.custom_view_imageView.setImageBitmap(foodImagesList.get(position))

        return customView
    }
}