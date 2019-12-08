package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.ICard

interface IStack<C : ICard> {

    val faceVisible: Boolean
    val cards: MutableList<C>

//    override val resourceID: Int
//        get() = when {
//            cards.isEmpty() -> R.drawable.target_frame
//            faceVisible -> cards[0].resourceID
//            else -> R.drawable.red_joker //TODO back icon
//        }
}
