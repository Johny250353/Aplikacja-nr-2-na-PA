package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.*
import com.example.apkanapa.databinding.ActivityMainBinding

class Hub : AppCompatActivity() {

    var imie: String = "" //ustala wartosc imienia na null jakby nie zostalo wpisane
    lateinit var wyborstat : Spinner //deklaracja spinnera do wyboru cech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)

        imie = intent.getStringExtra("imie").toString() //wpisuje imie z mainactivity i przypisuje te wartosc do zmiennej imie

        val pisz = findViewById<TextView>(R.id.Historia) //przypisanie funkcji pisania do okna z historią rzutow

        pisz.setMovementMethod(ScrollingMovementMethod()) //linijka do scrolowania historii

        wyborstat = findViewById(R.id.spinner) //przypisuje wartosc spinnera do zmiennej zdeklarowanej w linijce 14
        val Cech = resources.getStringArray(R.array.cech) //deklaracja do funkcji spinnera
        if (wyborstat != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Cech)
            wyborstat.adapter = adapter
        }


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

        val p20 = findViewById<RadioButton>(R.id.radioButtonp20)
        val m20 = findViewById<RadioButton>(R.id.radioButtonm20)
        val p0 = findViewById<RadioButton>(R.id.radioButton0)
        val p10 = findViewById<RadioButton>(R.id.radioButtonp10)
        val m10 = findViewById<RadioButton>(R.id.radioButtonm10)


        var mod = 0

        if(p20.isChecked)
        {
            mod = 20
        }
        if(p10.isChecked)
        {
            mod = 10
        }
        if(p0.isChecked)
        {
            mod = 0
        }
        if(m10.isChecked)
        {
            mod = -10
        }
        if(m20.isChecked)
        {
            mod = -20
        }




        var ilek2 = findViewById<EditText>(R.id.editTextNumberK2)
        var ik2 = ilek2.text.toString()
        var intik2 = 0
        if (ik2 != "")
        {
            intik2 = ik2.toInt()
        }

        for (i in 1..intik2) {

            var k2 = (1..2).random()

            k2 = k2+mod
            if(k2<1)
            {
                k2 = 1
            }

            pisz.append("${k2},")

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

            k3=k3+mod
            if(k3<1){

                k3=1
            }

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

            k4=k4+mod
            if(k4 <1)
            {
                k4=1
            }
            pisz.append("${k4}, ")

        }

        var ilek6 = findViewById<EditText>(R.id.editTextNumberK6)
        var ik6 = ilek6.text.toString()
        var intik6 = 0
        if (ik6 != "")
        {
            intik6 = ik6.toInt()
        }

        for (i in 1..intik6) {
            var k6 = (1..6).random()
            k6=mod+k6
            if(k6 <1)
            {
                k6=1
            }
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
            k8=k8+mod
            if(k8<1){
                k8=1
            }
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
            k10=k10+mod
            if (k10<1){
                k10=1
            }
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

            k20=k20+mod
            if (k20<1){
                k20=1
            }
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

            k100=k100+mod
            if (k100<1){
                k100=1
            }
            pisz.append("${k100}, ")

        }
        val czyswitch = findViewById<Switch>(R.id.switch2)

        if(czyswitch.isChecked) {
            pisz.append("${imie}\n")
        }
        else {
            pisz.append("..\n")
        }


    }

    fun OnClickButtonClear(view: View) {

        val Clear = findViewById<TextView>(R.id.Historia)
        Clear.setText("")

    }









}