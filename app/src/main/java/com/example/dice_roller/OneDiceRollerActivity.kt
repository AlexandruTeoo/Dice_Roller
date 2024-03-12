package com.example.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class OneDiceRollerActivity : ComponentActivity() {
    private var dice:TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_dice_roller)

        dice = findViewById(R.id.textView)

        val roll: Button = findViewById(R.id.btnRoll)

        roll.setOnClickListener { rollDice() }
    }

    private fun rollDice()
    {
        val randomNumber = (1..6).random()
        dice?.text = randomNumber.toString()
    }
}