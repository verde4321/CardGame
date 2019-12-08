package com.tinf18b2.cardgame.view.drawers

import android.graphics.Canvas
import android.graphics.drawable.Drawable
import com.tinf18b2.cardgame.R
import com.tinf18b2.cardgame.model.cards.skat.SkatStack
import com.tinf18b2.cardgame.model.display.IDrawer
import com.tinf18b2.cardgame.model.logic.GameModel

object SkatStackDrawer : IDrawer<SkatStack> {

    lateinit var frame: Drawable

    override fun draw(objct: SkatStack, canvas: Canvas) {
        if (!::frame.isInitialized) {
            frame = GameModel.activity!!.getDrawable(R.drawable.target_frame)!!
            frame.setBounds(0, 0, 140, 210)
        }
        if (objct.cards.isEmpty())
            frame.draw(canvas)
        else
            SkatCardDrawer.draw(objct.cards[0], canvas)
    }
}
