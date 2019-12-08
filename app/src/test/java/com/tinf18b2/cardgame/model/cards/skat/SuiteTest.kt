package com.tinf18b2.cardgame.model.cards.skat

import org.junit.Test

import org.junit.Assert.*

class SuiteTest {

    @Test
    fun testToString() {
        assertEquals(Suite.CLUB.toString(), "Clubs")
        assertEquals(Suite.DIAMOND.toString(), "Diamonds")
        assertEquals(Suite.HEART.toString(), "Hearts")
        assertEquals(Suite.SPADE.toString(), "Spades")
    }
}
