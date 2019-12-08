package com.tinf18b2.cardgame.view.drawers

import android.graphics.Canvas
import android.graphics.drawable.Drawable
import com.tinf18b2.cardgame.model.cards.skat.SkatCard
import com.tinf18b2.cardgame.model.display.IDrawer
import com.tinf18b2.cardgame.model.logic.GameModel
import java.util.*

object SkatCardDrawer : IDrawer<SkatCard> {

    val images: EnumMap<SkatCard, Drawable> = EnumMap(SkatCard::class.java)

    override fun draw(objct: SkatCard, canvas: Canvas) {
        val drawable = images.getOrPut(objct, { GameModel.activity!!.getDrawable(objct.resourceID) })
        drawable.setBounds(0, 0, 140, 210)
        drawable.draw(canvas)
    }
}
