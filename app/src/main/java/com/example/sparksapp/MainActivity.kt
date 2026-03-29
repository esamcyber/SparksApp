package com.example.sparksapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var input : EditText
    lateinit var result : TextView
    lateinit var btnShow : Button
    lateinit var btnReset : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.editTextTime)
        result = findViewById(R.id.txtResult)
        btnShow = findViewById(R.id.btnShow)
        btnReset = findViewById(R.id.btnReset)

        btnShow.setOnClickListener {
            val time = input.text.toString().lowercase().trim()
            if (time == "morning") {
                result.text = "Send morning text"

            } else if (time == "mid-morning") {
                result.text = "Reply to text messages"

            } else if (time == "afternoon") {
                result.text = "Interact with people on social media "

            } else if (time == "lunch") {
                result.text = "Check in on friends and relatives"

            } else if (time == "dinner") {
                result.text = "Keep up with current affairs"

            } else if (time == "night") {
                result.text = "Engage with someone online"
            }


        }
        btnReset.setOnClickListener {
            input.text.clear()
            result.text = ""

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}