import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    private Dealer dealer;
    private Player player;
    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        player = new Player();
        dealer = new Dealer(deck);
        card = new Card(CardSuit.SPADES, CardValue.ACE);
    }

    @Test
    public void handStartsAt0(){
        assertEquals(0, player.getSizeOfHand());
    }

    @Test
    public void canAddToHand(){
        player.addCardToHand(card);
        assertEquals(1, player.getSizeOfHand());
    }

    @Test
    public void canGetHandTotal() {
        Card card1 = new Card(CardSuit.DIAMONDS, CardValue.SEVEN);
        Card card2 = new Card(CardSuit.HEARTS, CardValue.NINE);
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        int total = player.getHandValue();
        assertEquals(16, total);
    }

    @Test
    public void playerCanBust(){
        Card card1 = new Card(CardSuit.DIAMONDS, CardValue.SEVEN);
        Card card2 = new Card(CardSuit.HEARTS, CardValue.NINE);
        Card card3 = new Card(CardSuit.SPADES, CardValue.EIGHT);
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        player.addCardToHand(card3);
        assertEquals(true, player.checkBust());
    }

}
