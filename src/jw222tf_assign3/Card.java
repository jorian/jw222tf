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

    /*
    Creates a Card object with two variables, suit and rank. Takes two parameters, one from enum type Suit and one from
    enum type Rank.
     */
    public Card(Suit nwSuit, Rank nwRank) {
        suit = nwSuit;
        rank = nwRank;
    }

    /*
    Returns a string representation of the Card object.
     */
    public String displayCard() {
        String str = String.valueOf(rank + " of " + suit);
        return str;
    }

    /*
    Returns the enum Suit
     */
    public Suit getSuit() {
        return suit;
    }

    /*
    Returns the enum Rank
     */
    public Rank getRank() {
        return rank;
    }
}