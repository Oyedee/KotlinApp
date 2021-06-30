 package com.example.firstkotlinapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_id)

        val diceSides: TextView = findViewById(R.id.textView_sides)

        button.setOnClickListener(){
            rollDice()
        }
    }

    private fun rollDice() {
        val myFirstDice = Dice(6)
        val diceRoll: TextView = findViewById(R.id.textView_roll)
        diceRoll.text = myFirstDice.roll().toString()
    }
}