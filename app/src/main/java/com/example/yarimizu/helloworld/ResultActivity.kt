package com.example.yarimizu.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val message = intent.getStringExtra("message")

        val textView = findViewById<TextView>(R.id.textView)

        textView.text = message
    }
}
