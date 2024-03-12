package com.example.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dice_roller.ui.theme.Dice_RollerTheme

class MainActivity : ComponentActivity() {
    private var dice:TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll:Button = findViewById(R.id.btnRoll)
        dice = findViewById(R.id.tvDiceNumber)
        roll.setOnClickListener { rollDice() }
    }

    private fun rollDice()
    {
        //Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()


        val randomNumber:Int = (1..6).random()
        dice?.text = randomNumber.toString()
    }
}
