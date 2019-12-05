package com.tinf18b2.cardgame.model.cards.skat

enum class Suite constructor(private val suiteName: String) {
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    override fun toString(): String = suiteName
}
