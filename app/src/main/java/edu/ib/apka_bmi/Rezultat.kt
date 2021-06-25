package edu.ib.apka_bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Rezultat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezultat)


        val wiadomosc = intent.getStringExtra("Wynik")   //wyświetlanie wyniku BMI (rezultat), który został obliczony w aktywności MainActivity
        val odpowiedz = findViewById<TextView>(R.id.wynik).apply {
            text = wiadomosc
        }

    }
}
