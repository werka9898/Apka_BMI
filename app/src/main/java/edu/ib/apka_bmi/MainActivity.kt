package edu.ib.apka_bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

const val EXTRA_MESSAGE="edu.ib.Apka_BMI.MESSAGE"

class MainActivity : AppCompatActivity() {

    private var obliczButton:Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        obliczButton=findViewById<Button>(R.id.oblicz)

        obliczButton?.setOnClickListener {
            val intent = Intent(this, Wynik::class.java)
            startActivity(intent)

            bmi()


        }


    }

    private fun bmi(){
        val input=findViewById<TextView>(R.id.waga) //zczytujemy z pola tekstowego o nazwie edNumber1
        val userInput = input.text.toString()
        val input2= findViewById<TextView>(R.id.wzrost)
        val userInput2 = input2.text.toString()


        val answer=oblicz(userInput.toDouble(), userInput2.toDouble()).toString()
        val message = answer.toString()

        val intent2= Intent(this,Wynik::class.java ).
        apply{
            putExtra(EXTRA_MESSAGE,message)
        }
        startActivity(intent2)
    }




    private fun oblicz(x:Double, y:Double): Double{

        var z: Double
        z = x/(y*y)
        return z
    }
}
