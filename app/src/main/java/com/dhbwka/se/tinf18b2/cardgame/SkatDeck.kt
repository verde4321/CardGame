package com.dhbwka.se.tinf18b2.cardgame

enum class SkatDeck(val suite: Suite, val value: Value, val path: Int) {
    ACE_CLUB(Suite.CLUB, Value.ACE, R.drawable.ace_of_clubs),
    TWO_CLUB(Suite.CLUB, Value.TWO, R.drawable.c2_of_clubs),
    THREE_CLUB(Suite.CLUB, Value.THREE, R.drawable.c3_of_clubs),
    FOUR_CLUB(Suite.CLUB, Value.FOUR, R.drawable.c4_of_clubs),
    FIVE_CLUB(Suite.CLUB, Value.FIVE, R.drawable.c5_of_clubs),
    SIX_CLUB(Suite.CLUB, Value.SIX, R.drawable.c6_of_clubs),
    SEVE_CLUB(Suite.CLUB, Value.SEVEN, R.drawable.c7_of_clubs),
    EIGHT_CLUB(Suite.CLUB, Value.EIGHT, R.drawable.c8_of_clubs),
    NINE_CLUB(Suite.CLUB, Value.NINE, R.drawable.c9_of_clubs),
    TEN_CLUB(Suite.CLUB, Value.TEN, R.drawable.c10_of_clubs),
    JACK_CLUB(Suite.CLUB, Value.JACK, R.drawable.jack_of_clubs2),
    QUEEN_CLUB(Suite.CLUB, Value.QUEEN, R.drawable.queen_of_clubs2),
    KING_CLUB(Suite.CLUB, Value.KING, R.drawable.king_of_clubs2),

    ACE_DIAMONDS(Suite.DIAMONDS, Value.ACE, R.drawable.ace_of_diamonds),
    TWO_DIAMONDS(Suite.DIAMONDS, Value.TWO, R.drawable.c2_of_diamonds),
    THREE_DIAMONDS(Suite.DIAMONDS, Value.THREE, R.drawable.c3_of_diamonds),
    FOUR_DIAMONDS(Suite.DIAMONDS, Value.FOUR, R.drawable.c4_of_diamonds),
    FIVE_DIAMONDS(Suite.DIAMONDS, Value.FIVE, R.drawable.c5_of_diamonds),
    SIX_DIAMONDS(Suite.DIAMONDS, Value.SIX, R.drawable.c6_of_diamonds),
    SEVE_DIAMONDS(Suite.DIAMONDS, Value.SEVEN, R.drawable.c7_of_diamonds),
    EIGHT_DIAMONDS(Suite.DIAMONDS, Value.EIGHT, R.drawable.c8_of_diamonds),
    NINE_DIAMONDS(Suite.DIAMONDS, Value.NINE, R.drawable.c9_of_diamonds),
    TEN_DIAMONDS(Suite.DIAMONDS, Value.TEN, R.drawable.c10_of_diamonds),
    JACK_DIAMONDS(Suite.DIAMONDS, Value.JACK, R.drawable.jack_of_diamonds2),
    QUEEN_DIAMONDS(Suite.DIAMONDS, Value.QUEEN, R.drawable.queen_of_diamonds2),
    KING_DIAMONDS(Suite.DIAMONDS, Value.KING, R.drawable.king_of_diamonds2),

    ACE_HEART(Suite.HEART, Value.ACE, R.drawable.ace_of_hearts),
    TWO_HEART(Suite.HEART, Value.TWO, R.drawable.c2_of_hearts),
    THREE_HEART(Suite.HEART, Value.THREE, R.drawable.c3_of_hearts),
    FOUR_HEART(Suite.HEART, Value.FOUR, R.drawable.c4_of_hearts),
    FIVE_HEART(Suite.HEART, Value.FIVE, R.drawable.c5_of_hearts),
    SIX_HEART(Suite.HEART, Value.SIX, R.drawable.c6_of_hearts),
    SEVE_HEART(Suite.HEART, Value.SEVEN, R.drawable.c7_of_hearts),
    EIGHT_HEART(Suite.HEART, Value.EIGHT, R.drawable.c8_of_hearts),
    NINE_HEART(Suite.HEART, Value.NINE, R.drawable.c9_of_hearts),
    TEN_HEART(Suite.HEART, Value.TEN, R.drawable.c10_of_hearts),
    JACK_HEART(Suite.HEART, Value.JACK, R.drawable.jack_of_hearts2),
    QUEEN_HEART(Suite.HEART, Value.QUEEN, R.drawable.queen_of_hearts2),
    KING_HEART(Suite.HEART, Value.KING, R.drawable.king_of_hearts2),

    ACE_SPADE(Suite.SPADE, Value.ACE, R.drawable.ace_of_spades),
    TWO_SPADE(Suite.SPADE, Value.TWO, R.drawable.c2_of_spades),
    THREE_SPADE(Suite.SPADE, Value.THREE, R.drawable.c3_of_spades),
    FOUR_SPADE(Suite.SPADE, Value.FOUR, R.drawable.c4_of_spades),
    FIVE_SPADE(Suite.SPADE, Value.FIVE, R.drawable.c5_of_spades),
    SIX_SPADE(Suite.SPADE, Value.SIX, R.drawable.c6_of_spades),
    SEVE_SPADE(Suite.SPADE, Value.SEVEN, R.drawable.c7_of_spades),
    EIGHT_SPADE(Suite.SPADE, Value.EIGHT, R.drawable.c8_of_spades),
    NINE_SPADE(Suite.SPADE, Value.NINE, R.drawable.c9_of_spades),
    TEN_SPADE(Suite.SPADE, Value.TEN, R.drawable.c10_of_spades),
    JACK_SPADE(Suite.SPADE, Value.JACK, R.drawable.jack_of_spades2),
    QUEEN_SPADE(Suite.SPADE, Value.QUEEN, R.drawable.queen_of_spades2),
    KING_SPADE(Suite.SPADE, Value.KING, R.drawable.king_of_spades2);

    override fun toString(): String {
        return "${value.name} of ${suite.name}";
    }
}
