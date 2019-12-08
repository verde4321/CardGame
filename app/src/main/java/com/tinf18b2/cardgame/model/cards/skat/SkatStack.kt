package com.tinf18b2.cardgame.model.cards.skat

import com.tinf18b2.cardgame.model.cards.stack.IConsumerStack

class SkatStack : IConsumerStack<SkatCard> {

    override val cards: MutableList<SkatCard> = ArrayList()

}
