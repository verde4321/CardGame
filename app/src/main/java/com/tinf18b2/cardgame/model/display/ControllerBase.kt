package com.tinf18b2.cardgame.model.display

import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.tinf18b2.cardgame.view.activity.NewGameActivity
import com.tinf18b2.cardgame.view.game.DrawableView

abstract class ControllerBase {

    abstract fun onTouch(view: DrawableView<*>, event: MotionEvent): Boolean

    open fun getLayoutParams(view: DrawableView<*>): ViewGroup.MarginLayoutParams {
        return createParams(150, 150, (100 + 600 * Math.random()).toInt(), (100 + 300 * Math.random()).toInt())
    }

    protected fun createParams(width: Int, height: Int, x: Int, y: Int): ViewGroup.MarginLayoutParams {
        val params = RelativeLayout.LayoutParams(width, height)
        params.leftMargin = x
        params.topMargin = y
        return params
    }

    abstract fun changeActivity(old: NewGameActivity?, new: NewGameActivity?)

    abstract fun stopGame()
}
