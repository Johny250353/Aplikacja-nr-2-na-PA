package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ModyfikacjaKosci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modyfikacja_kosci)
    }

    fun OnClickButton41(view: android.view.View) { //
        var powrut41 = Intent(
            this,
            Hub::class.java
        ) //to ma przejsc program do nastepnego okna Poczatkowego
        startActivity(powrut41)

    }
}