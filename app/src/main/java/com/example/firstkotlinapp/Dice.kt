package com.example.firstkotlinapp

class Dice {
    var sides = 6
    fun roll(): Int {
        val randomNumber: Int = (1..6).random()
        return randomNumber
    }
}