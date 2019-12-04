package com.tinf18b2.cardgame.model.cards.skat

import com.tinf18b2.cardgame.model.cards.ICard

interface ISkatCard : ICard {

    val suite: Suite;
    val rank: Rank;

    override val cardName: String
        get() = "${rank.name} of ${suite.name}"

}
