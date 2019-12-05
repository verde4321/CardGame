package com.tinf18b2.cardgame.model.cards.skat

import org.junit.Test

import org.junit.Assert.*

class SkatCardTest {

    @Test
    fun getCardName() {
        assertEquals(SkatCard.CLUBS_ACE.cardName, "Ace of Clubs")
        assertEquals(SkatCard.HEARTS_SEVEN.cardName, "Seven of Hearts")
        assertEquals(SkatCard.SPADES_TWO.cardName, "Two of Spades")
        assertEquals(SkatCard.DIAMONDS_JACK.cardName, "Jack of Diamonds")
    }

    @Test
    fun getSuite() {
        SkatCard.values().forEach {
            val suite = it.name.split("S_", limit = 2)[0]
            assertSame(Suite.valueOf(suite), it.suite)
        }
    }

    @Test
    fun getRank() {
        SkatCard.values().forEach {
            val rank = it.name.split("S_", limit = 2)[1]
            assertSame(Rank.valueOf(rank), it.rank)
        }
    }
}
