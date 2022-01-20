package com.example.apkanapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.room.Room


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

        var WW = (25..50).random()

        val funkcjaWW = findViewById<EditText>(R.id.editTextWW)
        funkcjaWW.setText("${WW}")

        var US = (25..50).random()

        val funkcjaUS = findViewById<EditText>(R.id.editTextUS)
        funkcjaUS.setText("${US}")

        var K = (25..50).random()

        val funkcjaK = findViewById<EditText>(R.id.editTextK)
        funkcjaK.setText("${K}")

        var Odp = (25..50).random()

        val funkcjaOdp = findViewById<EditText>(R.id.editTextOdp)
        funkcjaOdp.setText("${Odp}")

        var Zr = (25..50).random()

        val funkcjaZr = findViewById<EditText>(R.id.editTextZr)
        funkcjaZr.setText("${Zr}")

        var Int = (25..50).random()

        val funkcjaInt = findViewById<EditText>(R.id.editTextInt)
        funkcjaInt.setText("${Int}")

        var SW = (25..50).random()

        val funkcjaSW = findViewById<EditText>(R.id.editTextSW)
        funkcjaSW.setText("${SW}")

        var Ogd = (25..50).random()

        val funkcjaOgd = findViewById<EditText>(R.id.editTextOgd)
        funkcjaOgd.setText("${Ogd}")

    }

    fun OnClickButtonZapisz(view: android.view.View) {

        var imieEditText = findViewById<EditText>(R.id.editText_imie2)
        var imie = imieEditText.text.toString()

        val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java, "AppDatabase"
        ).allowMainThreadQueries().build()

        val playerCartDao = db.playerCartDao()

        val cart = playerCartDao.findByName(imie)
        if (cart != null){
            Toast.makeText(this, "Karta istnieje", Toast.LENGTH_LONG).show()

            return
        }
        var editTextWW = findViewById<EditText>(R.id.editTextWW)
        var WW = editTextWW.text.toString()
        var intWW = 33
        if (WW != "")
        {
            intWW = WW.toInt()
        }
        var editTextUS = findViewById<EditText>(R.id.editTextUS)
        var US = editTextUS.text.toString()
        var intUS = 33
        if (US != "")
        {
            intUS = US.toInt()
        }
        var editTextK = findViewById<EditText>(R.id.editTextK)
        var K = editTextK.text.toString()
        var intK = 33
        if (K != "")
        {
            intK = K.toInt()
        }
        var editTextOdp = findViewById<EditText>(R.id.editTextOdp)
        var Odp = editTextOdp.text.toString()
        var intOdp = 33
        if (Odp != "")
        {
            intOdp = Odp.toInt()
        }
        var editTextZr = findViewById<EditText>(R.id.editTextZr)
        var Zr = editTextZr.text.toString()
        var intZr = 33
        if (Zr != "")
        {
            intZr = Zr.toInt()
        }
        var editTextInt = findViewById<EditText>(R.id.editTextInt)
        var Int = editTextInt.text.toString()
        var intInt = 33
        if (Int != "")
        {
            intInt = Int.toInt()
        }
        var editTextSW = findViewById<EditText>(R.id.editTextSW)
        var SW = editTextSW.text.toString()
        var intSW = 33
        if (SW != "")
        {
            intSW = SW.toInt()
        }
        var editTextOgd = findViewById<EditText>(R.id.editTextOgd)
        var Ogd = editTextOgd.text.toString()
        var intOgd = 33
        if (Ogd != "")
        {
            intOgd = Ogd.toInt()
        }

        val newCard = PlayerCart(imie,intWW,intUS,intK,intOdp,intZr,intInt,intSW,intOgd)
        playerCartDao.insert(newCard)

        Toast.makeText(this, "Karta dodana", Toast.LENGTH_LONG).show()

    }

    fun OnClickUsuńKarte(view: android.view.View) {

        var imieEditText = findViewById<EditText>(R.id.editText_imie2)
        var imie = imieEditText.text.toString()

        val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java, "AppDatabase"
        ).allowMainThreadQueries().build()

        val playerCartDao = db.playerCartDao()

        val cart = playerCartDao.findByName(imie)
        if (cart != null) {
            playerCartDao.delete(cart)
            Toast.makeText(this, "Karta usunienta", Toast.LENGTH_LONG).show()

            return
        }

        else {
            Toast.makeText(this, "Karta nie istnieje", Toast.LENGTH_LONG).show()
        }
    }

}
