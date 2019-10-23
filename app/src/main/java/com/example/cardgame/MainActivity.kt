package com.example.cardgame



import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)


        val imageButton = findViewById<ImageButton>(R.id.menuButton)
        imageButton?.setOnClickListener {
            startMenuActivity()
        }


    }

    fun startMenuActivity() {


        val intent = Intent(this, MenuSettings::class.java)
            intent.putExtra("key", "gg")

        this.startActivity(intent)


    }

}

