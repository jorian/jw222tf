package jw222tf_assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import jw222tf_assign3.Card.*;

/**
 * Created by Jorian on 7-12-2016 at 16:57.
 */

public class Deck {
    private ArrayList<Card> setOfCards = new ArrayList<>();
    private ArrayList<Card> dealtCards = new ArrayList<>();

    public Deck() {
        for (Suit nwSuit : Suit.values()) {
            for (Rank nwRank : Rank.values()) {
                Card temp = new Card(nwSuit, nwRank);
                setOfCards.add(temp);
            }
        }
    }

    public void displayFace(Card temp){
        System.out.println(temp.displayCard());
    }

    public void displaySetOfCards() {
        for (Card i : setOfCards) {
            System.out.println(i.displayCard());
        }
    }

    public void alternativeDisplaySetOfCards() {
        String face = "";
        for (Card i : setOfCards) {
            switch (i.getSuit()) {
                case Hearts : face = "\u2665";
                break;
                case Clubs: face = "\u2663";
                break;
                case Diamonds: face = "\u2666";
                break;
                case Spades: face = "\u2660";
            }
            System.out.println(i.getRank() + " " + face);
        }
    }

    public void returnDealtCards() {
        if (dealtCards.size() > 0) {
            int size = dealtCards.size();
            for (int i = 0; i < size; i++) {
                int position = dealtCards.size() - 1;
                Card temp = dealtCards.get(position);
                dealtCards.remove(position);
                setOfCards.add(temp);
            }
        }
    }

    public void shuffleSetOfCards() {
        if (cardsInDeck() == 52) {
            long seed = System.nanoTime();
            Collections.shuffle(setOfCards, new Random(seed));
        } else {
            System.out.println("The deck is incomplete and can not be shuffled.");
        }
    }

    public Card dealACard(boolean printFace) {
        int position = 52 - dealtCards.size() - 1; //deal a card from the end (like in real life)
        Card temp = setOfCards.get(position);
        setOfCards.remove(position); //removing an element is best done by starting at the end of arraylist
        dealtCards.add(temp);
        if (printFace) {
            displayFace(temp);
        }
        return temp;


//        System.out.println("A card has been drawn: "+ dealtCards.get(dealtCards.size() - 1).displayCard());
    }

    public int cardsInDeck() {
        return setOfCards.size();
    }
}