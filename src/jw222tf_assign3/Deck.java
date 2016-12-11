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

    /*
    Constructor creates an ordered deck of cards and adds a unique combination of Suit and Rank
    to the ArrayList setOfCards.
     */
    public Deck() {
        for (Suit nwSuit : Suit.values()) {
            for (Rank nwRank : Rank.values()) {
                Card temp = new Card(nwSuit, nwRank);
                setOfCards.add(temp);
            }
        }
    }

    /*
    Displays the face of the card (Suit and Rank).
    It accepts a Card object as a parameter, and goes to the Card class to print the values of the card-object.
     */
    public void displayFace(Card temp){
        System.out.println(temp.displayCard());
    }
    /*
    To display all the cards in the current setOfCards.
     */
    public void displaySetOfCards() {
        for (Card i : setOfCards) {
            displayFace(i);
        }
    }

    /*
    An alternative way of showing the four Suits in the current setOfCards.
     */
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

    /*
    Displays the cards that have been dealt.
     */
    public void displayDealtCards() {
        for (Card i : dealtCards) {
            displayFace(i);
        }
    }

    /*
    If cards have been dealt, they are added to the ArrayList dealtCards.
    This method can be called to return them to the ArrayList setOfCards.
     */
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

    /*
    Shuffles the setOfCards, but only if the set contains all the 52 cards. Incomplete sets cannot be shuffled and
    prints a message to inform the user.

    The shuffle method of the Collections library is used here. It shuffles the elements in setOfCards according
    to the Random object, passed as a parameter. Found here:
    http://stackoverflow.com/questions/2249520/javas-collections-shuffle-is-doing-what
     */
    public void shuffleSetOfCards() {
        if (cardsInDeck() == 52) {
            Collections.shuffle(setOfCards, new Random());
        } else {
            System.out.println("ERROR: The deck is incomplete and cannot be shuffled.");
        }
    }

    /*
    Deals a card, by removing the last element (Card object) from the current ArrayList setOfCards and place them in the
    first available position in ArrayList dealtCards by using the .add method. (Just like you would do in real life,
    cards are dealt face down. That means the last card in the stack is dealt first. It also is a good practice when
    removing elements from an ArrayList)

    For the game play123main, there is no need for printing the card every time it is dealt.
    So a parameter is passed in order to determine whether the card should be printed.
    (Is that ok? Or should I use two methods here, one with parameter and one without, where the one without parameter
    always prints the dealt card?)

    Returns a Card object.
     */
    public Card dealACard(boolean printFace) {
        int position = 52 - dealtCards.size() - 1;
        Card temp = setOfCards.get(position);
        setOfCards.remove(position);
        dealtCards.add(temp);
        if (printFace) {
            displayFace(temp);
        }
        return temp;
    }

    /*
    Returns the number of cards in the current ArrayList setOfCards.
     */
    public int cardsInDeck() {
        return setOfCards.size();
    }
}