package edu.ib.apka_bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Rezultat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezultat)


        val wiadomosc = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.wynik).apply {
            text = wiadomosc
        }

    }
}
