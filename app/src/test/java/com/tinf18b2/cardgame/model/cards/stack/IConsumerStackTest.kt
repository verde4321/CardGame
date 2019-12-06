package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.MockCard
import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
import org.junit.Test

class IConsumerStackTest {

    @Test
    fun testAddEmpty() {
        val test = MockConsumerStack<MockCard>(false, mutableListOf())
        test.addCard(MockCard.ONE)
        assertEquals(1, test.cards.size)
        assertSame(MockCard.ONE, test.cards[0])
    }

    @Test
    fun testAddNonEmpty() {
        val test = MockConsumerStack(false, mutableListOf(MockCard.ONE, MockCard.FOUR))
        test.addCard(MockCard.SIX)
        assertEquals(3, test.cards.size)
        assertSame(MockCard.SIX, test.cards[0])
        assertSame(MockCard.ONE, test.cards[1])
        assertSame(MockCard.FOUR, test.cards[2])
    }

    @Test
    fun testAddDuplicate() {
        val test = MockConsumerStack(false, mutableListOf(MockCard.ONE, MockCard.FOUR, MockCard.SIX, MockCard.TWO))
        test.addCard(MockCard.SIX)
        assertEquals(5, test.cards.size)
        assertSame(MockCard.SIX, test.cards[0])
        assertSame(MockCard.ONE, test.cards[1])
        assertSame(MockCard.FOUR, test.cards[2])
        assertSame(MockCard.SIX, test.cards[3])
        assertSame(MockCard.TWO, test.cards[4])
    }
}
