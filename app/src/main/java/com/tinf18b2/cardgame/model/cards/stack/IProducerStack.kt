package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.ICard

interface IProducerStack<C : ICard> : IStack<C> {

    override val faceVisible: Boolean
        get() = false

    fun hasCards(): Boolean = cards.isNotEmpty()

    fun availableCards(): Int = cards.size

    fun canDrawCard(): Boolean = true

    fun shuffle() = cards.shuffle()

    @Throws(IndexOutOfBoundsException::class)
    fun drawCard(): C {
        if (!hasCards())
            throw IndexOutOfBoundsException("No Cards on Stack")
        return cards.removeAt(0);
    }
}
