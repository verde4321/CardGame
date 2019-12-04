package com.tinf18b2.cardgame


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MenuSettings : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.menu)

            val privacyBTN = findViewById<Button>(R.id.privacy)
            privacyBTN?.setOnClickListener {
                startprivacy()
            }
        }

    fun startprivacy(){
        val intent = Intent(this, Privacy_Policy::class.java)
        intent.putExtra("key1", "gg22")

        this.startActivity(intent)

    }



}
