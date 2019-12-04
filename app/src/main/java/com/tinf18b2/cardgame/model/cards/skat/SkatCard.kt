package com.tinf18b2.cardgame.model.cards.skat

import com.tinf18b2.cardgame.R;

enum class SkatCard
constructor(override val suite: Suite, override val rank: Rank, override val resourceID: Int) : ISkatCard {

    CLUBS_TWO(Suite.CLUB, Rank.TWO, R.drawable.card_skat_clubs_c2),
    CLUBS_THREE(Suite.CLUB, Rank.THREE, R.drawable.card_skat_clubs_c3),
    CLUBS_FOUR(Suite.CLUB, Rank.FOUR, R.drawable.card_skat_clubs_c4),
    CLUBS_FIVE(Suite.CLUB, Rank.FIVE, R.drawable.card_skat_clubs_c5),
    CLUBS_SIX(Suite.CLUB, Rank.SIX, R.drawable.card_skat_clubs_c6),
    CLUBS_SEVEN(Suite.CLUB, Rank.SEVEN, R.drawable.card_skat_clubs_c7),
    CLUBS_EIGHT(Suite.CLUB, Rank.EIGHT, R.drawable.card_skat_clubs_c8),
    CLUBS_NINE(Suite.CLUB, Rank.NINE, R.drawable.card_skat_clubs_c9),
    CLUBS_TEN(Suite.CLUB, Rank.TEN, R.drawable.card_skat_clubs_c10),
    CLUBS_JACK(Suite.CLUB, Rank.JACK, R.drawable.card_skat_clubs2_jack),
    CLUBS_QUEEN(Suite.CLUB, Rank.QUEEN, R.drawable.card_skat_clubs2_queen),
    CLUBS_KING(Suite.CLUB, Rank.KING, R.drawable.card_skat_clubs2_king),
    CLUBS_ACE(Suite.CLUB, Rank.ACE, R.drawable.card_skat_clubs_ace),

    DIAMONDS_TWO(Suite.DIAMONDS, Rank.TWO, R.drawable.card_skat_diamonds_c2),
    DIAMONDS_THREE(Suite.DIAMONDS, Rank.THREE, R.drawable.card_skat_diamonds_c3),
    DIAMONDS_FOUR(Suite.DIAMONDS, Rank.FOUR, R.drawable.card_skat_diamonds_c4),
    DIAMONDS_FIVE(Suite.DIAMONDS, Rank.FIVE, R.drawable.card_skat_diamonds_c5),
    DIAMONDS_SIX(Suite.DIAMONDS, Rank.SIX, R.drawable.card_skat_diamonds_c6),
    DIAMONDS_SEVEN(Suite.DIAMONDS, Rank.SEVEN, R.drawable.card_skat_diamonds_c7),
    DIAMONDS_EIGHT(Suite.DIAMONDS, Rank.EIGHT, R.drawable.card_skat_diamonds_c8),
    DIAMONDS_NINE(Suite.DIAMONDS, Rank.NINE, R.drawable.card_skat_diamonds_c9),
    DIAMONDS_TEN(Suite.DIAMONDS, Rank.TEN, R.drawable.card_skat_diamonds_c10),
    DIAMONDS_JACK(Suite.DIAMONDS, Rank.JACK, R.drawable.card_skat_diamonds2_jack),
    DIAMONDS_QUEEN(Suite.DIAMONDS, Rank.QUEEN, R.drawable.card_skat_diamonds2_queen),
    DIAMONDS_KING(Suite.DIAMONDS, Rank.KING, R.drawable.card_skat_diamonds2_king),
    DIAMONDS_ACE(Suite.DIAMONDS, Rank.ACE, R.drawable.card_skat_diamonds_ace),

    HEARTS_TWO(Suite.HEART, Rank.TWO, R.drawable.card_skat_hearts_c2),
    HEARTS_THREE(Suite.HEART, Rank.THREE, R.drawable.card_skat_hearts_c3),
    HEARTS_FOUR(Suite.HEART, Rank.FOUR, R.drawable.card_skat_hearts_c4),
    HEARTS_FIVE(Suite.HEART, Rank.FIVE, R.drawable.card_skat_hearts_c5),
    HEARTS_SIX(Suite.HEART, Rank.SIX, R.drawable.card_skat_hearts_c6),
    HEARTS_SEVEN(Suite.HEART, Rank.SEVEN, R.drawable.card_skat_hearts_c7),
    HEARTS_EIGHT(Suite.HEART, Rank.EIGHT, R.drawable.card_skat_hearts_c8),
    HEARTS_NINE(Suite.HEART, Rank.NINE, R.drawable.card_skat_hearts_c9),
    HEARTS_TEN(Suite.HEART, Rank.TEN, R.drawable.card_skat_hearts_c10),
    HEARTS_JACK(Suite.HEART, Rank.JACK, R.drawable.card_skat_hearts2_jack),
    HEARTS_QUEEN(Suite.HEART, Rank.QUEEN, R.drawable.card_skat_hearts2_queen),
    HEARTS_KING(Suite.HEART, Rank.KING, R.drawable.card_skat_hearts2_king),
    HEARTS_ACE(Suite.HEART, Rank.ACE, R.drawable.card_skat_hearts_ace),

    SPADES_TWO(Suite.SPADE, Rank.TWO, R.drawable.card_skat_spades_c2),
    SPADES_THREE(Suite.SPADE, Rank.THREE, R.drawable.card_skat_spades_c3),
    SPADES_FOUR(Suite.SPADE, Rank.FOUR, R.drawable.card_skat_spades_c4),
    SPADES_FIVE(Suite.SPADE, Rank.FIVE, R.drawable.card_skat_spades_c5),
    SPADES_SIX(Suite.SPADE, Rank.SIX, R.drawable.card_skat_spades_c6),
    SPADES_SEVEN(Suite.SPADE, Rank.SEVEN, R.drawable.card_skat_spades_c7),
    SPADES_EIGHT(Suite.SPADE, Rank.EIGHT, R.drawable.card_skat_spades_c8),
    SPADES_NINE(Suite.SPADE, Rank.NINE, R.drawable.card_skat_spades_c9),
    SPADES_TEN(Suite.SPADE, Rank.TEN, R.drawable.card_skat_spades_c10),
    SPADES_JACK(Suite.SPADE, Rank.JACK, R.drawable.card_skat_spades2_jack),
    SPADES_QUEEN(Suite.SPADE, Rank.QUEEN, R.drawable.card_skat_spades2_queen),
    SPADES_KING(Suite.SPADE, Rank.KING, R.drawable.card_skat_spades2_king),
    SPADES_ACE(Suite.SPADE, Rank.ACE, R.drawable.card_skat_spades_ace);
}
