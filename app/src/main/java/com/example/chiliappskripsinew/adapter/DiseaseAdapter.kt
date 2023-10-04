package com.example.chiliappskripsinew.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.data.DiseaseData

class DiseaseAdapter(context: Context, dataArrayList: ArrayList<DiseaseData?>):
    ArrayAdapter<DiseaseData?>(context, R.layout.list_item, dataArrayList!! as List<DiseaseData?>) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var view = view
        val listData = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val listImage = view!!.findViewById<ImageView>(R.id.listImage_)
        val listName = view.findViewById<TextView>(R.id.listNameDisease)

        listImage.setImageResource(listData!!.imgDisease)
        listName.text = listData.nameDisease


        return view
    }
}