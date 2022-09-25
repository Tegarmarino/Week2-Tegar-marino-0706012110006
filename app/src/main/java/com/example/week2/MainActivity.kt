package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        membuat Intent untuk pindah ke page lain
        var btnAdd = findViewById<Button>(R.id.btn_add)
        btnAdd.setOnClickListener{
            var intent = Intent(this , addedit::class.java)
            startActivity(intent)
        }

    }
}