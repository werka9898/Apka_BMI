package edu.ib.apka_bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }


    fun bmi(view:View) {

        val input = findViewById<EditText>(R.id.waga)
        val input2 = findViewById<EditText>(R.id.wzrost)
        val userInput = input.text.toString().toDouble()  //zczytanie z pola "waga" wartości wagi
        val userInput2 = input2.text.toString().toDouble() //zczytanie z pola "wzrost" wartości wzrostu
        val wynik = oblicz(userInput, userInput2)  //odwołanie się do funkcji oblicz w celu wyliczenia BMI na podstawie wprowadzonych przez użytkownika danych
        val rezultat = String.format("%.2f", wynik)  //zaokrąglenie wyniku do dwóch miejsc po przecinku


        val intent = Intent(this, Rezultat::class.java).   //uruchomienie drugiej aktywności, w które będzie wyświetlany rezultat - wynik BMI

                apply{
                    putExtra("Wynik", rezultat)
                }

                startActivity(intent)

    }



    fun oblicz(x:Double, y:Double): Double{  //funkcja służąca do obliczenia ilorazu wagi i kwadratu wzrostu

      return x/(y*y)

   }


}
