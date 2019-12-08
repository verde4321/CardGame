package com.tinf18b2.cardgame.model.cards.stack

import com.tinf18b2.cardgame.model.cards.ICard

open class MockStack<C : ICard>(override val faceVisible: Boolean, override val cards: MutableList<C>) : IStack<C>

class MockProducerStack<C : ICard>(override val faceVisible: Boolean, override val cards: MutableList<C>) :
    MockStack<C>(faceVisible, cards), IProducerStack<C>

class MockConsumerStack<C : ICard>(override val faceVisible: Boolean, override val cards: MutableList<C>) :
    MockStack<C>(faceVisible, cards), IConsumerStack<C>

class MockPCStack<C : ICard>(override val faceVisible: Boolean, override val cards: MutableList<C>) :
    MockStack<C>(faceVisible, cards), IProducerStack<C>, IConsumerStack<C>



