package com.juaracoding.ujian1batch4androidkotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        Handler(Looper.getMainLooper()).postDelayed({
            findViewById<TextView>(R.id.txtNama).text = "Nama: Daniel"
            findViewById<TextView>(R.id.txtEmail).text = "Email: daniel@google.com"

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}
