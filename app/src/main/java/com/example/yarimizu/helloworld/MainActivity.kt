package com.example.yarimizu.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editText)

            val message = editText.text.toString()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("message", message)

            startActivity(intent)
        }
    }
}
