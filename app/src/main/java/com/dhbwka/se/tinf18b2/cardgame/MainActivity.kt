package com.dhbwka.se.tinf18b2.cardgame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

//const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val singlePlayer = findViewById<Button>(R.id.button4)
        singlePlayer?.setOnClickListener {
            startTestGui()
        }

        val imageButton = findViewById<ImageButton>(R.id.menuButton)
        imageButton?.setOnClickListener {
            startMenuActivity()
        }


    }

    private fun startTestGui() {
        val intent = Intent(this, TestGUI::class.java)
        intent.putExtra("key", "gg")

        this.startActivity(intent)
    }

    private fun startMenuActivity() {


        val intent = Intent(this, MenuSettings::class.java)
        intent.putExtra("key", "gg")

        this.startActivity(intent)


    }

}
