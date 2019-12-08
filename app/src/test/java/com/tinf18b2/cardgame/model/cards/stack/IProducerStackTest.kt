package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.MockCard
import org.junit.Assert.*
import org.junit.Test

class IProducerStackTest {

    @Test
    fun testStatusEmpty() {
        val test = MockProducerStack<MockCard>(false, mutableListOf())
        assertFalse(test.hasCards())
        assertEquals(0, test.availableCards())
    }

    @Test
    fun testStatusOne() {
        val test = MockProducerStack(false, mutableListOf(MockCard.THREE))
        assertTrue(test.hasCards())
        assertEquals(1, test.availableCards())
    }

    @Test
    fun testStatusMultiple() {
        val test = MockProducerStack(false, mutableListOf(MockCard.FOUR, MockCard.TWO, MockCard.FIVE))
        assertTrue(test.hasCards())
        assertEquals(3, test.availableCards())
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun testDrawEmpty() {
        val test = MockProducerStack<MockCard>(false, mutableListOf())
        test.drawCard()
    }

    @Test
    fun testDrawOne() {
        val test = MockProducerStack(false, mutableListOf(MockCard.THREE))
        assertSame(MockCard.THREE, test.drawCard())
        assertTrue(test.cards.isEmpty())
    }

    @Test
    fun testDrawMultiple() {
        val test = MockProducerStack(false, mutableListOf(MockCard.FOUR, MockCard.TWO, MockCard.FIVE))
        assertSame(MockCard.FOUR, test.drawCard())
        assertSame(MockCard.TWO, test.drawCard())
        assertSame(MockCard.FIVE, test.drawCard())
        assertTrue(test.cards.isEmpty())
    }

}
