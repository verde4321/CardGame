package com.dhbwka.se.tinf18b2.cardgame

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Privacy_Policy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.privacy_policy)

        val linkTextView = findViewById<TextView>(R.id.link)
        linkTextView?.setOnClickListener {
            privacyFromGoogle()
        }

    }
    fun privacyFromGoogle(){
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://policies.google.com/privacy"))
        startActivity(i)

    }
}
