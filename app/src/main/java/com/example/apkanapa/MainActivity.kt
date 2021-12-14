package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //const val EXTRA_MESSAGE = "com.example.apkanapa.MESSAGE"

    }

  /*  fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText_imie)
        val message = editText.text.toString()
        val intent = Intent(this, Hub::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    } */

}
