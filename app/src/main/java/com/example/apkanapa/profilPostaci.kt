package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText



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

    fun OnclickButtonStat(view: android.view.View) {

        var WW = (30..50).random()

        val funkcjaWW = findViewById<EditText>(R.id.editTextWW)
        funkcjaWW.setText("${WW}")

        var US = (30..50).random()

        val funkcjaUS = findViewById<EditText>(R.id.editTextUS)
        funkcjaUS.setText("${US}")

        var K = (30..50).random()

        val funkcjaK = findViewById<EditText>(R.id.editTextK)
        funkcjaK.setText("${K}")

        var Odp = (30..50).random()

        val funkcjaOdp = findViewById<EditText>(R.id.editTextOdp)
        funkcjaOdp.setText("${Odp}")

        var Zr = (30..50).random()

        val funkcjaZr = findViewById<EditText>(R.id.editTextZr)
        funkcjaZr.setText("${Zr}")

        var Int = (30..50).random()

        val funkcjaInt = findViewById<EditText>(R.id.editTextInt)
        funkcjaInt.setText("${Int}")

        var SW = (30..50).random()

        val funkcjaSW = findViewById<EditText>(R.id.editTextSW)
        funkcjaSW.setText("${SW}")

        var Ogd = (30..50).random()

        val funkcjaOgd = findViewById<EditText>(R.id.editTextOgd)
        funkcjaOgd.setText("${Ogd}")

    }

}
