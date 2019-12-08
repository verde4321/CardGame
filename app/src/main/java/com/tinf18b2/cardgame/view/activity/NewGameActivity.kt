package com.tinf18b2.cardgame.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.tinf18b2.cardgame.R
import com.tinf18b2.cardgame.model.logic.GameModel
import com.tinf18b2.cardgame.view.game.DrawableView

class NewGameActivity : AppCompatActivity() {

    lateinit var layout: RelativeLayout

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_game_ui)
        layout = findViewById(R.id.rl)

        GameModel.changeActiveActivity(this)
    }

    fun close() {
        GameModel.changeActiveActivity(null)
        finish()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return true
    }
}
