package jw222tf_assign3;

/**
 * Created by Jorian on 9-12-2016 at 12:38.
 */
public class Play123Main {
    public static void main(String[] args) {
        boolean win = false;
        int nWins = 0;
        for (int i = 0; i < 10000; i++) {
            win = play123();
            if (win) {
                nWins++;
            }
        }
        System.out.println("From playing 10,000 times, " + nWins + " games were won.");
        System.out.printf("\nThat is a probability of %.2f%%.\n", ((nWins * 100.0) / 10000));

    }

    private static boolean play123() {
        Deck deck = new Deck();
        deck.shuffleSetOfCards();
        Card temp;
        int a = 1;
        int size = deck.cardsInDeck();

        for (int i = 0; i < size; i++) {
            temp = deck.dealACard(false);
            if (a == 1) {
                a = 2;
                if (temp.getRank() == Card.Rank.Ace) {
                    return false;
                }
            } else {
                if (a == 2) {
                    a = 3;
                    if (temp.getRank() == Card.Rank.Deuce) {
                        return false;
                    }
                } else {
                    a = 1;
                    if (temp.getRank() == Card.Rank.Three) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
