package jw222tf_assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import jw222tf_assign3.Card.*;

/**
 * Created by Jorian on 7-12-2016 at 16:57.
 */

public class Deck {
    ArrayList<Card> setOfCards = new ArrayList<>();

    public Deck() {


        for (Suit nwSuit : Suit.values()) {
            for (Rank nwRank : Rank.values()) {
                Card temp = new Card(nwSuit, nwRank);
                setOfCards.add(temp);
                System.out.println(temp.displayCard());
            }
        }
    }

    public void displaySetOfCards() {
        for (Card i : setOfCards) {
            System.out.println(i.displayCard());
        }
    }

    public void shuffleSetOfCards() {
        long seed = System.nanoTime();
        Collections.shuffle(setOfCards, new Random(seed));
    }
}