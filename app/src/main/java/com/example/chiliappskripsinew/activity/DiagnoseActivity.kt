package com.example.chiliappskripsinew.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import com.example.chiliappskripsinew.R

class DiagnoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose)

        //pemanggilan data gejala
        val g01 = findViewById<CheckBox>(R.id.Gejala_A)
        val g02 = findViewById<CheckBox>(R.id.Gejala_B)
        val g03 = findViewById<CheckBox>(R.id.Gejala_C)
        val g04 = findViewById<CheckBox>(R.id.Gejala_D)
        val g05 = findViewById<CheckBox>(R.id.Gejala_E)
        val g06 = findViewById<CheckBox>(R.id.Gejala_F)
        val g07 = findViewById<CheckBox>(R.id.Gejala_G)
        val g08 = findViewById<CheckBox>(R.id.Gejala_H)
        val g09 = findViewById<CheckBox>(R.id.Gejala_I)
        val g10 = findViewById<CheckBox>(R.id.Gejala_J)
        val g11 = findViewById<CheckBox>(R.id.Gejala_K)
        val g12 = findViewById<CheckBox>(R.id.Gejala_L)
        val g13 = findViewById<CheckBox>(R.id.Gejala_M)
        val g14 = findViewById<CheckBox>(R.id.Gejala_N)
        val g15 = findViewById<CheckBox>(R.id.Gejala_O)
        val g16 = findViewById<CheckBox>(R.id.Gejala_P)
        val g17 = findViewById<CheckBox>(R.id.Gejala_Q)

        val result = findViewById<TextView>(R.id.result)
        val click = findViewById<Button>(R.id.Click_button)

        //operasi forward chaining
        click.setOnClickListener {
            if (g01.isChecked && g02.isChecked && g03.isChecked){
                result.text = "Terjangkit Penyakit Berak Daun (Cescospora)"
            }
            else if (g04.isChecked && g01.isChecked && g05.isChecked){
                result.text = "Terjangkit Penyakit Busuk Daun (Phytophtora)"
            }
            else if (g06.isChecked && g07.isChecked && g08.isChecked){
                result.text = "Terjangkit Penyakit Busuk Buah Antraknosa "
            }
            else if (g09.isChecked && g10.isChecked && g04.isChecked && g11.isChecked){
                result.text = "Terjangkit Penyakit Layu (Fusarium)"
            }
            else if (g12.isChecked && g13.isChecked && g14.isChecked && g15.isChecked){
                result.text = "Terjangkit Penyakit Rebah Kecambah"
            }
            else if (g16.isChecked && g04.isChecked && g08.isChecked && g17.isChecked){
                result.text = "Terjangkit Penyakit Virus Kuning (Gemini Virus)"
            }
            else{
                result.text = "Silahkan klik untuk mendiagnosa "
            }

        }
    }
}