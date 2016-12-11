package jw222tf_assign3;

/**
 * Created by Jorian on 8-12-2016 at 22:46.
 */
public class PlayingCardsMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("The initial deck: ");
        deck.displaySetOfCards();

        System.out.println("\nThe deck, but shuffled: ");
        deck.shuffleSetOfCards();
        deck.displaySetOfCards();

        System.out.println("\nPrint the deck in an alternative way: ");
        deck.alternativeDisplaySetOfCards();

        System.out.println("\nLet's deal three cards: ");
        deck.dealACard(true);
        deck.dealACard(true);
        deck.dealACard(true);

        System.out.println("\nCards left in deck: "+ deck.cardsInDeck());

        System.out.println("\nLet's try to shuffle this incomplete deck now: ");
        deck.shuffleSetOfCards();

        System.out.println("\nOh, the cards should first be returned. \nCards in deck before returning: " + deck.cardsInDeck());
        deck.returnDealtCards();
        System.out.println("Cards in deck after returning: " + deck.cardsInDeck());

        System.out.println("\nNow, the deck can be shuffled:");
        deck.shuffleSetOfCards();
        System.out.println("Cards left in deck: "+ deck.cardsInDeck());


    }
}
