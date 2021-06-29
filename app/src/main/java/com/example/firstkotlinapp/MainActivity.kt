package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_id)
        val diceSides = findViewById<TextView>(R.id.textView_sides)
        val diceRoll = findViewById<TextView>(R.id.textView_roll)

        button?.setOnClickListener(){
            val myFirstDice = Dice()
            diceSides.setText(myFirstDice.sides.toString())

            val diceNumber = myFirstDice.roll().toString()

            diceRoll.setText(diceNumber)

        }
    }
}