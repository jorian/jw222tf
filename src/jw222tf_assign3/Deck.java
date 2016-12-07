package jw222tf_assign3;

import jw222tf_assign3.Card.*;

import java.util.ArrayList;

/**
 * Created by Jorian on 7-12-2016 at 16:57.
 */

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (Suit chooseSuit : Suit.values()) {
            for (Rank chooseRank : Rank.values()) {
                deck.add(new Card(chooseSuit, chooseRank));
            }
        }
    }


    public void showCards() {
        for (Card i : deck) {
            System.out.println(i);
        }
    }
}
