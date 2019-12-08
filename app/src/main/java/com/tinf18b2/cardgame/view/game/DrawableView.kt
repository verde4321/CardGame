package com.tinf18b2.cardgame.view.game

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.view.MotionEvent
import android.view.View
import android.widget.RelativeLayout
import com.tinf18b2.cardgame.model.display.IDrawer
import com.tinf18b2.cardgame.model.logic.GameModel

class DrawableView<E : Any> constructor(const: Context) : View(const) {

    lateinit var drawer: IDrawer<E>
    lateinit var objct: E

    val layout
        get() = parent as RelativeLayout

    fun initialize(objct: E, drawer: IDrawer<E>) {
        this.objct = objct
        this.drawer = drawer
        layoutParams = GameModel.controller!!.getLayoutParams(this)
    }

    fun remove() {
        layout.removeView(this)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return GameModel.controller!!.onTouch(this, event) || super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawer.draw(this, canvas)
    }
}
