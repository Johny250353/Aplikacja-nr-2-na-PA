package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.*

class Hub : AppCompatActivity() {

    var imie: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)

        imie = intent.getStringExtra("imie").toString()

    }



    fun OnClickButton3(view: View) {
        var trzeciePrzejscie = Intent(
            this,
            ModyfikacjaKosci::class.java
        ) //to ma przejsc program do nastepnego okna modyfikacji kosci
        startActivity(trzeciePrzejscie)
    }

    fun OnClickButton31(view: View) {
        var trzeciePowrot = Intent(
            this,
            MainActivity::class.java
        ) //to ma przejsc program do nastepnego okna Poczatkowego
        startActivity(trzeciePowrot)
    }

    fun OnClickButtonRzut(view: View) {

        val pisz = findViewById<TextView>(R.id.Historia)


        var ilek2 = findViewById<EditText>(R.id.editTextNumberK2)
        var ik2 = ilek2.text.toString()
        var intik2 = 0
        if (ik2 != "")
        {
            intik2 = ik2.toInt()
        }

        for (i in 1..intik2) {
            var k2 = (1..2).random()


            pisz.append("${k2}, ")

        }

        var ilek3 = findViewById<EditText>(R.id.editTextNumberK3)
        var ik3 = ilek3.text.toString()
        var intik3 = 0
        if (ik3 != "")
        {
            intik3 = ik3.toInt()
        }

        for (i in 1..intik3) {
            var k3 = (1..3).random()


            pisz.append("${k3}, ")

        }

        var ilek4 = findViewById<EditText>(R.id.editTextNumberK4)
        var ik4 = ilek4.text.toString()
        var intik4 = 0
        if (ik4 != "")
        {
            intik4 = ik4.toInt()
        }

        for (i in 1..intik4) {
            var k4 = (1..4).random()


            pisz.append("${k4}, ")

        }

        var ilek6 = findViewById<EditText>(R.id.editTextNumberK6)
        var ik6 = ilek4.text.toString()
        var intik6 = 0
        if (ik6 != "")
        {
            intik6 = ik6.toInt()
        }

        for (i in 1..intik6) {
            var k6 = (1..6).random()


            pisz.append("${k6}, ")

        }

        var ilek8 = findViewById<EditText>(R.id.editTextNumberK8)
        var ik8 = ilek8.text.toString()
        var intik8 = 0
        if (ik8 != "")
        {
            intik8 = ik8.toInt()
        }

        for (i in 1..intik8) {
            var k8 = (1..8).random()


            pisz.append("${k8}, ")

        }

        var ilek10 = findViewById<EditText>(R.id.editTextNumberK10)
        var ik10 = ilek10.text.toString()
        var intik10 = 0
        if (ik10 != "")
        {
            intik10 = ik10.toInt()
        }

        for (i in 1..intik10) {
            var k10 = (1..10).random()


            pisz.append("${k10}, ")

        }

        var ilek20 = findViewById<EditText>(R.id.editTextNumberK20)
        var ik20 = ilek20.text.toString()
        var intik20 = 0
        if (ik20 != "")
        {
            intik20 = ik20.toInt()
        }

        for (i in 1..intik20) {
            var k20 = (1..20).random()


            pisz.append("${k20}, ")

        }

        var ilek100 = findViewById<EditText>(R.id.editTextNumberK100)
        var ik100 = ilek100.text.toString()
        var intik100 = 0
        if (ik100 != "")
        {
            intik100 = ik100.toInt()
        }

        for (i in 1..intik100) {
            var k100 = (1..100).random()


            pisz.append("${k100}, ")

        }



        pisz.append("${imie}\nSuma:\n")


    }

    fun OnClickButtonClear(view: View) {

        val Clear = findViewById<TextView>(R.id.Historia)
        Clear.setText("")

    }
}