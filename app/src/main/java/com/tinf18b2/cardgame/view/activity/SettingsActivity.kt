package com.tinf18b2.cardgame.view.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tinf18b2.cardgame.R

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        val privacyBTN = findViewById<Button>(R.id.privacy)
        privacyBTN?.setOnClickListener {
            openPrivacyPolicy()
        }

        val tosBtn = findViewById<Button>(R.id.tos)
        tosBtn?.setOnClickListener {
            openTos()
        }
    }

    private fun openPrivacyPolicy() {
        val intent = Intent(this, PrivacyPolicyActivity::class.java)
        this.startActivity(intent)
    }

    private fun openTos() {
        val intent = Intent(this, TOSActivity::class.java)
        this.startActivity(intent)
    }
}
