package com.example.chiliappskripsinew.activity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.example.chiliappskripsinew.R
import com.example.chiliappskripsinew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.AppLogo.setImageResource(R.drawable.logo_chili)

        binding.diagnoseCardView.setOnClickListener {
            val intent = Intent(this, DiagnoseActivity::class.java)
            startActivity(intent)
        }

        binding.sickCardView.setOnClickListener {
            val intent = Intent(this, ListChiliDisease::class.java)
            startActivity(intent)
        }

        binding.aboutCardView.setOnClickListener {
            val intent = Intent(this, AboutApp::class.java)
            startActivity(intent)
        }

        binding.plantCardView.setOnClickListener {
            val intent = Intent(this, PlantChiliTreatment::class.java)
            startActivity(intent)
        }
       // setupView()
    }

}