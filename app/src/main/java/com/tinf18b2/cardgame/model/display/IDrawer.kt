package com.tinf18b2.cardgame.model.display

import android.graphics.Canvas
import com.tinf18b2.cardgame.view.game.DrawableView

interface IDrawer<E: Any> {

    /** drawing is clipped to 0,0 - width,height by Android */
    fun draw(view: DrawableView<E>, canvas: Canvas) {
        draw(view.objct, canvas)
    }

    fun draw(objct: E, canvas: Canvas)

}
