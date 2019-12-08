package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.ICard

interface IConsumerStack<C : ICard> : IStack<C> {

    override val faceVisible: Boolean
        get() = true

    fun canAcceptCard(card: C): Boolean = true

    fun addCard(card: C) {
        cards.add(0, card);
    }
}
