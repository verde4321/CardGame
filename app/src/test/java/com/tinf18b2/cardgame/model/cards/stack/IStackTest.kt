package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.R
import com.tinf18b2.cardgame.model.cards.MockCard
import org.junit.Assert.assertEquals
import org.junit.Test

class IStackTest {

    @Test
    fun testGetResourceIDEmpty() {
        val test = MockStack<MockCard>(false, mutableListOf())
        assertEquals(R.drawable.target_frame, test.resourceID)
    }

    @Test
    fun testGetResourceIDHidden() {
        val test = MockStack(false, mutableListOf(MockCard.ONE))
        assertEquals(R.drawable.red_joker, test.resourceID) //TODO backside drawable
    }

    @Test
    fun testGetResourceIDShown() {
        val test = MockStack(true, mutableListOf(MockCard.ONE))
        assertEquals(MockCard.ONE.resourceID, test.resourceID)
    }
}
