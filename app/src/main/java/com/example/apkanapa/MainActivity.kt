package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClickButton(view: android.view.View) {
        var pierwszePrzejscie = Intent(
            this,
            Hub::class.java
        ) //to ma przejsc program do nastepnego okna Hub

        val pst = findViewById<EditText>(R.id.editText_imie)
        var imie = pst.text.toString()
        Hub.imieGacza = imie

        startActivity(pierwszePrzejscie)

    }

    fun OnClickButton2(view: android.view.View) {
        var drugiePrzejscie = Intent(
            this,
            profilPostaci::class.java
        ) //to ma przejsc program do nastepnego okna Hub
        startActivity(drugiePrzejscie)
    }


}