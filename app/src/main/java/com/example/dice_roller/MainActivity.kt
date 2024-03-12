package com.example.dice_roller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one:Button = findViewById(R.id.button1)
        val two:Button = findViewById(R.id.button2)

        one.setOnClickListener {
            val intent = Intent (this, OneDiceRollerActivity::class.java)
            startActivity(intent)
        }

        two.setOnClickListener {
            val intent = Intent (this, TwoDiceRollerActivity::class.java)
            startActivity(intent)
        }
    }
}
