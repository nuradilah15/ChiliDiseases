package com.example.chiliappskripsinew.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.databinding.ActivityDetailPlantTreatBinding

class DetailPlantTreat : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPlantTreatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPlantTreatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null){
            val name = intent.getStringExtra("name")
            val desc = intent.getIntExtra("desc", R.string.S01)
            val image = intent.getIntExtra("image", R.drawable.logo_solusi)

            binding.namedetailTreat.text = name
            binding.detailDescPlant.setText(desc)
            binding.detailImagePlant.setImageResource(image)
        }
        binding.btnBackTreat.setOnClickListener {
            val moveIntent = Intent(this@DetailPlantTreat, PlantChiliTreatment::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
            finish()
        }
    }
}