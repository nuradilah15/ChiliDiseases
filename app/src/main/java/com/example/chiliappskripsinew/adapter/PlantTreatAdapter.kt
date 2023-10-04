package com.example.chiliappskripsinew.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.data.PlantData

class PlantTreatAdapter (context: Context, dataArrayList: ArrayList<PlantData?>?) :
    ArrayAdapter<PlantData?>(context, R.layout.list_item, dataArrayList!!) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var view = view
        val dataPlant = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val listImage = view!!.findViewById<ImageView>(R.id.listImage_)
        val listName = view.findViewById<TextView>(R.id.listNameDisease)

        listImage.setImageResource(dataPlant!!.imgSolution)
        listName.text = dataPlant.namePlant


        return view
    }
}