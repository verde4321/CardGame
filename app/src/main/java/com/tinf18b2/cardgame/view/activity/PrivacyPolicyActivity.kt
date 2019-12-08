package com.tinf18b2.cardgame.view.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.tinf18b2.cardgame.R

class PrivacyPolicyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.privacy_policy)

        val linkTextView = findViewById<TextView>(R.id.link)
        linkTextView?.setOnClickListener {
            openGooglePrivacyPolicy()
        }
    }

    private fun openGooglePrivacyPolicy(){
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://policies.google.com/privacy"))
        startActivity(i)
    }
}
