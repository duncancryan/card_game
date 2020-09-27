import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player();
        player2 = new Player();
        dealer = new Dealer(deck);
        card = new Card(CardSuit.SPADES, CardValue.ACE);
    }

    @Test
    public void handStartsAt0(){
        assertEquals(0, player1.getSizeOfHand());
    }

    @Test
    public void canAddToHand(){
        player1.addCardToHand(card);
        assertEquals(1, player1.getSizeOfHand());
    }
}
