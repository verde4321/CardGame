package com.tinf18b2.cardgame.view.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.tinf18b2.cardgame.R
import com.tinf18b2.cardgame.controller.TestController
import com.tinf18b2.cardgame.model.logic.GameModel

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val singlePlayer = findViewById<Button>(R.id.singleplayer)
        singlePlayer?.setOnClickListener {
            startTestGui()
        }

        val imageButton = findViewById<ImageButton>(R.id.settings)
        imageButton?.setOnClickListener {
            startMenuActivity()
        }
    }

    private fun startTestGui() {
//        val intent = Intent(this, GameActivity::class.java)
        GameModel.changeController(TestController())
        val intent = Intent(this, NewGameActivity::class.java)
        this.startActivity(intent)
    }

    private fun startMenuActivity() {
        val intent = Intent(this, SettingsActivity::class.java)
        this.startActivity(intent)
    }
}
