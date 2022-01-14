package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class profilPostaci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_postaci)
    }

    fun OnClickButton51(view: android.view.View) { //
        var Powrot51 = Intent(
            this,
            MainActivity::class.java
        ) //to ma przejsc program do nastepnego okna Poczatkowego
        startActivity(Powrot51)
    }
}