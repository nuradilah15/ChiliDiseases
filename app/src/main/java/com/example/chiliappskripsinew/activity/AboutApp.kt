package com.example.chiliappskripsinew.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chiliappskripsinew.databinding.ActivityAboutAppBinding

class AboutApp : AppCompatActivity() {

    private lateinit var bindingAboutApp: ActivityAboutAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingAboutApp = ActivityAboutAppBinding.inflate(layoutInflater)
        setContentView(bindingAboutApp.root)
        supportActionBar?.hide()

        bindingAboutApp.btnBack.setOnClickListener {
            val moveIntent = Intent(this@AboutApp, MainActivity::class.java)
            moveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(moveIntent)
            finish()
        }
    }
}