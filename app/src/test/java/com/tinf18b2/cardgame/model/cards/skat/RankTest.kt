package com.tinf18b2.cardgame.model.cards.skat

import org.junit.Test

import org.junit.Assert.*

class RankTest {

    @Test
    fun testToString() {
        assertEquals(Rank.ACE.toString(), "Ace")
        assertEquals(Rank.KING.toString(), "King")
        assertEquals(Rank.QUEEN.toString(), "Queen")
        assertEquals(Rank.JACK.toString(), "Jack")
        assertEquals(Rank.TEN.toString(), "Ten")
        assertEquals(Rank.NINE.toString(), "Nine")
        assertEquals(Rank.EIGHT.toString(), "Eight")
        assertEquals(Rank.SEVEN.toString(), "Seven")
        assertEquals(Rank.SIX.toString(), "Six")
        assertEquals(Rank.FIVE.toString(), "Five")
        assertEquals(Rank.FOUR.toString(), "Four")
        assertEquals(Rank.THREE.toString(), "Three")
        assertEquals(Rank.TWO.toString(), "Two")
    }
}
