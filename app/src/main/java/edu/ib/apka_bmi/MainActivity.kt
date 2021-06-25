package edu.ib.apka_bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE="edu.ib.apka_bmi.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }


    fun bmi(view:View) {

        val input = findViewById<EditText>(R.id.waga)
        val input2 = findViewById<EditText>(R.id.wzrost)
        val userInput = input.text.toString().toDouble()
        val userInput2 = input2.text.toString().toDouble()
        val wynik = oblicz(userInput, userInput2)
        val rezultat = String.format("%.2f", wynik)


        val intent = Intent(this, Rezultat::class.java).

                apply{
                    putExtra(EXTRA_MESSAGE, rezultat)
                }

                startActivity(intent)


    }



    fun oblicz(x:Double, y:Double): Double{

      return x/(y*y)

   }


}
