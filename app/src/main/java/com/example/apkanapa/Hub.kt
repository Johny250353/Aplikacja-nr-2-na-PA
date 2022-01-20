package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.*
import androidx.room.Room
import com.example.apkanapa.databinding.ActivityMainBinding

class Hub : AppCompatActivity() {

    companion object {
        var KS4: Array<String> = emptyArray()
        var KS6: Array<String> = emptyArray()
        var imieGacza: String = ""
    }




    lateinit var wyborstat : Spinner //deklaracja spinnera do wyboru cech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)


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

        var suma = 0

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
            suma = suma + k2
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
            suma = suma + k3
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
            suma = suma + k4
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
            suma = suma + k6
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
            suma = suma + k8
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
            suma = suma + k10
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
            suma = suma + k20
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
            suma = suma + k100
            pisz.append("${k100}, ")

        }

        var ileks4 = findViewById<EditText>(R.id.editTextKS4)
        var iks4 = ileks4.text.toString()
        var intiks4 = 0
        if (iks4 != "")
        {
            intiks4 = iks4.toInt()
        }

        if (Hub.KS4.size == 4) {
            for (i in 1..intiks4) {
                var ks4 = (0..3).random()



                pisz.append("${Hub.KS4[ks4]}, ")

            }
        }

        var ileks6 = findViewById<EditText>(R.id.editTextKS6)
        var iks6 = ileks6.text.toString()
        var intiks6 = 0
        if (iks6 != "")
        {
            intiks6 = iks6.toInt()
        }

        if (Hub.KS6.size == 6) {
            for (i in 1..intiks6) {
                var ks6 = (0..5).random()



                pisz.append("${Hub.KS6[ks6]}, ")

            }
        }

        pisz.append("suma rzutów: ${suma} ")

        val czyswitch = findViewById<Switch>(R.id.switch2)

        if(czyswitch.isChecked) {

            pisz.append("Gracz: ${imieGacza}\n")

            var imieEditText = findViewById<EditText>(R.id.editTextwybierzimie)
            var imie = imieEditText.text.toString()

            val db = Room.databaseBuilder(
                this,
                AppDatabase::class.java, "AppDatabase"
            ).allowMainThreadQueries().build()

            val playerCartDao = db.playerCartDao()

            val cart = playerCartDao.findByName(imie)
            if (cart == null){
                Toast.makeText(this, "Karta nie istnieje", Toast.LENGTH_LONG).show()

                return
            }

            Toast.makeText(this, "Działa pomyślnie karty!", Toast.LENGTH_LONG).show()

            var wartoscSpiner = findViewById<Spinner>(R.id.spinner)
            var spinn = wartoscSpiner.selectedItem.toString()

            if(spinn == "WW") {
                pisz.append("WW Twoje wynosi: ${cart.WW}\n")
            }
            else if(spinn == "US") {
                pisz.append("US Twoje wynosi: ${cart.US}\n")
            }
            else if(spinn == "K") {
                pisz.append("K Twoje wynosi: ${cart.K}\n")
            }
            else if(spinn == "Odp") {
                pisz.append("Odp Twoje wynosi: ${cart.Odp}\n")
            }
            else if(spinn == "Zr") {
                pisz.append("Zr Twoje wynosi: ${cart.Zr}\n")
            }
            else if(spinn == "Int") {
                pisz.append("Int Twoje wynosi: ${cart.Int}\n")
            }
            else if(spinn == "SW") {
                pisz.append("SW Twoje wynosi: ${cart.SW}\n")
            }
            else if(spinn == "Ogd") {
                pisz.append("Ogd Twoje wynosi: ${cart.Ogd}\n")
            }

        }
        else {
            pisz.append("..\n")
            Toast.makeText(this, "Nie używasz karty", Toast.LENGTH_LONG).show()
        }


    }

    fun OnClickButtonClear(view: View) {

        val Clear = findViewById<TextView>(R.id.Historia)
        Clear.setText("")

    }









}