package edu.ib.apka_bmi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Wynik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wynik)

        val message = intent?.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.wynik).apply {
            text = message
        }


    }
}