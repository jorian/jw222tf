package jw222tf_assign3;

/**
 * Created by Jorian on 8-12-2016 at 22:46.
 */
public class PlayingCardsMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.displaySetOfCards();

        deck.shuffleSetOfCards();
        deck.displaySetOfCards();
    }
}
