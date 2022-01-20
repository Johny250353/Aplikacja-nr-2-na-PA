package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

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

    fun OnClickButtonZapiszKosci(view: android.view.View) {

        val editKS4_1 = findViewById<EditText>(R.id.editTextKS4_1)
        var KS4_1 = editKS4_1.text.toString()

        val editKS4_2 = findViewById<EditText>(R.id.editTextKS4_2)
        var KS4_2 = editKS4_2.text.toString()

        val editKS4_3 = findViewById<EditText>(R.id.editTextKS4_3)
        var KS4_3 = editKS4_3.text.toString()

        val editKS4_4 = findViewById<EditText>(R.id.editTextKS4_4)
        var KS4_4 = editKS4_4.text.toString()

        val editKS6_1 = findViewById<EditText>(R.id.editTextKS6_1)
        var KS6_1 = editKS6_1.text.toString()

        val editKS6_2 = findViewById<EditText>(R.id.editTextKS6_2)
        var KS6_2 = editKS6_2.text.toString()

        val editKS6_3 = findViewById<EditText>(R.id.editTextKS6_3)
        var KS6_3 = editKS6_3.text.toString()

        val editKS6_4 = findViewById<EditText>(R.id.editTextKS6_4)
        var KS6_4 = editKS6_4.text.toString()

        val editKS6_5 = findViewById<EditText>(R.id.editTextKS6_5)
        var KS6_5 = editKS6_5.text.toString()

        val editKS6_6 = findViewById<EditText>(R.id.editTextKS6_6)
        var KS6_6 = editKS6_6.text.toString()

        val KS4Array = arrayOf(KS4_1,KS4_2,KS4_3,KS4_4) //tworzymy tablice dla wartosci z nawiuasy
        val KS6Array = arrayOf(KS6_1,KS6_2,KS6_3,KS6_4,KS6_5,KS6_6)

        Hub.KS4 = KS4Array //urzyczamy zmiennych innemu layoutowi
        Hub.KS6 = KS6Array
    }
}