package com.tinf18b2.cardgame.model.cards

enum class MockCard constructor(override val cardName: String, override val resourceID: Int) : ICard {
    ONE("ONE", 1),
    TWO("TWO", 2),
    THREE("THREE", 3),
    FOUR("FOUR", 4),
    FIVE("FIVE", 5),
    SIX("SIX", 6)
}
