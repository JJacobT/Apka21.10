package com.example.apka2110

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dopisz = findViewById<Button>(R.id.button_dop)
        val przywroc = findViewById<Button>(R.id.button_pr)
        val tekst = findViewById<TextView>(R.id.textView)
        val wpisz = findViewById<EditText>(R.id.editTextTextPersonName)

        dopisz.setOnClickListener {
            tekst.text = tekst.text.toString() + wpisz.text
        }

    }

}