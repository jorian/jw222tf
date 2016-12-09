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
        System.out.println(nWins);
    }

    private static boolean play123() {
        Deck deck = new Deck();
        deck.shuffleSetOfCards();
        Card temp;

        for (int i = deck.cardsInDeck() - 1; i >= 0; i--) {
            temp = deck.dealACard(false);
            if (i % 2 != 0) {
                if (i % 3 == 0) {   // it is 3
                    if (temp.getRank() == Card.Rank.Three) {
                        return false;
                    }
                } else {            // it is 1
                    if (temp.getRank() == Card.Rank.Ace) {
                        return false;
                    }
                }
            } else {
                if (temp.getRank() == Card.Rank.Deuce) { // it is 2.
                    return false;
                }
            }
        }
        return true;
    }
}
