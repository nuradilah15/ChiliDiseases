package com.example.chiliappskripsinew.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.adapter.DiseaseAdapter
import com.example.chiliappskripsinew.data.DiseaseData
import com.example.chiliappskripsinew.databinding.ActivityListChiliDiseaseBinding

class ListChiliDisease : AppCompatActivity() {

    private lateinit var binding: ActivityListChiliDiseaseBinding
    private lateinit var diseaseAdapter: DiseaseAdapter
    private lateinit var diseaseData: DiseaseData
    var dataArrayList = ArrayList<DiseaseData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListChiliDiseaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.p_cercospora,
            R.drawable.p_phytophtora,
            R.drawable.p_busuk_buah,
            R.drawable.p_fusarium,
            R.drawable.p_rebah_kecambah,
            R.drawable.p_gemini
        )

        val descList = intArrayOf(
            R.string.P01Desc,
            R.string.PO2Desc,
            R.string.P03Des,
            R.string.P04Desc,
            R.string.P05Desc,
            R.string.P06Desc
        )

        val nameDiseaseList = arrayOf("Bercak daun Cescospora",
            "Busuk Daun Phytophtora","Busuk Buah Antraknosa ",
            "Layu Fusarium", "Rebah Kecambah",
            "Gemini Virus")

        for (i in imageList.indices){
            diseaseData = DiseaseData(
                nameDiseaseList [i], descList [i], imageList[i]
            )
            dataArrayList.add(diseaseData)
        }
        diseaseAdapter = DiseaseAdapter(this@ListChiliDisease, dataArrayList)
        binding.listViewDisease.adapter = diseaseAdapter
        binding.listViewDisease.isClickable =true
        binding.listViewDisease.onItemClickListener =
            AdapterView.OnItemClickListener{ adapterView, view, i, l ->
                val intent = Intent(this@ListChiliDisease, DetailDisease::class.java)
                intent.putExtra("name", nameDiseaseList[i])
                intent.putExtra("desc", descList[i])
                intent.putExtra("image", imageList[i])
                startActivity(intent)
            }

        binding.btnBackChiliDisease.setOnClickListener {
            val moveIntent = Intent(this@ListChiliDisease, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
            finish()
        }
    }
}