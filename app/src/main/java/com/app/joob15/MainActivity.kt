package com.app.joob15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnnama = findViewById<Button>(R.id.nama)
        val btnkelas = findViewById<Button>(R.id.kelas)
        val btnnis = findViewById<Button>(R.id.nis)

        btnnama.setOnClickListener {
            Toast.makeText(this, "M rifqil Khanif", Toast.LENGTH_SHORT).show()
        }
        btnkelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()
        }
        btnnis.setOnClickListener {
            Toast.makeText(this, "3015", Toast.LENGTH_SHORT).show()
        }

    }
}