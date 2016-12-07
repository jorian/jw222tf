package jw222tf_assign3;

/**
 * Created by Jorian on 7-12-2016 at 16:19.
 */
public class Card {
    public enum Suit {
        Clubs, Diamonds, Spades, Hearts
    }
    public enum Rank {
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }
    private Suit suit;
    private Rank rank;

    public Card(Suit nwSuit, Rank nwRank) {
        suit = nwSuit;
        rank = nwRank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }


}

/*
            ACE(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
                    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
            private int value;

            private rank(int value) {
                this.value = value;
        }
    }
}
*/