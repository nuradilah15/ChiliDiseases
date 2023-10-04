package com.example.chiliappskripsinew.activity

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.adapter.PlantTreatAdapter
import com.example.chiliappskripsinew.data.PlantData
import com.example.chiliappskripsinew.databinding.ActivityPlantChiliTreatmentBinding

class PlantChiliTreatment : AppCompatActivity() {

    private lateinit var bindingPlant: ActivityPlantChiliTreatmentBinding
    private lateinit var adapterPlant: PlantTreatAdapter
    private lateinit var listDataPlant: PlantData
    var dataArrayListPlant = ArrayList<PlantData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingPlant = ActivityPlantChiliTreatmentBinding.inflate(layoutInflater)
        setContentView(bindingPlant.root)

        val imagePlant = intArrayOf(
            R.drawable.logo_solusi,
            R.drawable.logo_solusi,
            R.drawable.logo_solusi,
            R.drawable.logo_solusi,
            R.drawable.logo_solusi,
            R.drawable.logo_solusi,
        )

        val descPlant = intArrayOf(
            R.string.S01,
            R.string.S02,
            R.string.S03,
            R.string.S04,
            R.string.S05,
            R.string.S06
        )

        val namePlant = arrayOf(
            "Bercak daun Cescospora",  "Busuk Daun Phytophtora","Busuk Buah Antraknosa ",
            "Layu Fusarium", "Rebah Kecambah",
            "Gemini Virus"
        )
        for (i in imagePlant.indices){
            listDataPlant = PlantData(
                namePlant[i],
                descPlant[i],
                imagePlant[i]
            )
            dataArrayListPlant.add(listDataPlant)
        }
        adapterPlant = PlantTreatAdapter(this@PlantChiliTreatment, dataArrayListPlant)
        bindingPlant.listTreat.adapter = adapterPlant
        bindingPlant.listTreat.isClickable = true
        bindingPlant.listTreat.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(this@PlantChiliTreatment, DetailPlantTreat::class.java)
                intent.putExtra("name", namePlant[i])
                intent.putExtra("desc", descPlant[i])
                intent.putExtra("image", imagePlant[i])
                startActivity(intent)
            }

        bindingPlant.btnBackChiliTreat.setOnClickListener {
            val moveIntent = Intent(this@PlantChiliTreatment, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
            finish()
        }
    }
}