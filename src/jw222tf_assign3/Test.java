package jw222tf_assign3;

import java.util.ArrayList;

/**
 * Created by Jorian on 7-12-2016 at 21:33.
 */
public class Test {
    public enum Suit {
        Clubs, Diamonds, Spades, Hearts
    }
    public enum Rank {
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }
    private Suit suit;
    private Rank rank;

    public Test(Suit nwSuit, Rank nwRank) {
        suit = nwSuit;
        rank = nwRank;
    }

    public String displayCards() {
        String str = String.valueOf(rank + " of " + suit);
        return str;
    }

    public static void main(String[] args) {
        ArrayList<Test> deck = new ArrayList<>();

        for (Suit nwSuit : Suit.values()) {
            for (Rank nwRank : Rank.values()) {
                Test temp = new Test(nwSuit, nwRank);
                deck.add(temp);
                System.out.println(temp.displayCards());
            }
        }
    }
}
