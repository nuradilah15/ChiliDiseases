package com.example.chiliappskripsinew.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.databinding.ActivityDetailDiseaseBinding

class DetailDisease : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDiseaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDiseaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name",)
            val desc = intent.getIntExtra("desc", R.string.P01Desc)
            val image = intent.getIntExtra("image", R.drawable.bercak)

            binding.detailName.text = name
            binding.detailDescDisease.setText(desc)
            binding.detailImageDisease.setImageResource(image)

        }

        binding.btnBackDisease.setOnClickListener {
            val moveIntent = Intent(this@DetailDisease, ListChiliDisease::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
            finish()
        }

    }

}