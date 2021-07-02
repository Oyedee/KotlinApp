package com.example.firstkotlinapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_id)

        val diceSides: TextView = findViewById(R.id.textView_sides)

        button.setOnClickListener() {
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val myFirstDice = Dice(6)
        val diceRoll = myFirstDice.roll()

        // Update the screen with the dice roll
//        val diceRoll: TextView = findViewById(R.id.textView_roll)
//        diceRoll.text = myFirstDice.roll().toString()


        /**
         * This code calls the `setImageResource()` method on the `ImageView`, passing the resource ID for the `dice_2` image.
         * This will update the `ImageView` on screen to display the `dice_2` image.
        */
        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }

        //let's optimize our when statement for a more clean code
        /**
         * The only thing that changes between each case is the resource ID that's being used.
         * That means you can create a variable to store the resource ID to use.
         * Then you can call diceImage.setImageResource()only once in your code and pass in the correct resource ID.
         */
        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}

/**
 * Code snippet for practicing classes and inheritance in Kotlin
 */
fun main() {
    val squareCabin = SquareCabin(6)
    with(squareCabin) {
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? : ${hasRoom()}")
    }
}

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }
}
class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "wood"
    override val capacity = 6
}

