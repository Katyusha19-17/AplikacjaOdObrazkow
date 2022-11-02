package com.example.mojaaplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flaga = 0

        findViewById<Button>(R.id.button1).setOnClickListener {
            if(flaga==0) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.katyushadwa)
                flaga = 1
            }
            else{
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.katyusha)
                flaga = 0
            }
        }
    }
}