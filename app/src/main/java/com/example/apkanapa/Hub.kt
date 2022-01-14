package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class Hub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)



    }

    fun OnClickButton3(view: android.view.View) { //
        var trzeciePrzejscie = Intent(
            this,
            ModyfikacjaKosci::class.java
        ) //to ma przejsc program do nastepnego okna modyfikacji kosci
        startActivity(trzeciePrzejscie)
    }

    fun OnClickButton31(view: android.view.View) { //
        var trzeciePowrot = Intent(
            this,
            MainActivity::class.java
        ) //to ma przejsc program do nastepnego okna Poczatkowego
        startActivity(trzeciePowrot)
    }







}