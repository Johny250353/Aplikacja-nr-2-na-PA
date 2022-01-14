package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import com.example.apkanapa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // binding = ActivityMainBinding.inflate(LayoutInflater) //boze czemu to nie dziala

        // binding.buttonGraj.setOnClickListener{ it: View!


    }


    fun OnClickButton(view: android.view.View) {
        var pierwszePrzejscie = Intent(
            this,
            Hub::class.java
        ) //to ma przejsc program do nastepnego okna Hub
        startActivity(pierwszePrzejscie)
        val pst = findViewById<EditText>(R.id.editText_imie) //linija do odnajdywania edittextu i ustawiajaca tam napis
        pst.setText("twojastara") //ustawia napis

    }

    fun OnClickButton2(view: android.view.View) { //
        var drugiePrzejscie = Intent(
            this,
            profilPostaci::class.java
        ) //to ma przejsc program do nastepnego okna Hub
        startActivity(drugiePrzejscie)
    }


}


