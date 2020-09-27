import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Deck deck;
    private Dealer dealer;
    private Player player;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
        deck.populateDeck();
        card = new Card(CardSuit.SPADES, CardValue.ACE);
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(deck, dealer.getDeck());
    }

    @Test
    public void dealerHandStartsAt0(){
        assertEquals(0, dealer.getSizeOfHand());
    }

    @Test
    public void dealerDeckIsPopulated(){
        int deckNum = dealer.getDeck().getNumberOfCards();
        assertEquals(52, deckNum);
    }

    @Test
    public void canAddToHand(){
        dealer.addCardToHand(card);
        assertEquals(1, dealer.getSizeOfHand());
    }

    @Test
    public void canDealToPlayer(){
        dealer.dealToPlayer(player);
        assertEquals(1, player.getSizeOfHand());
    }

    @Test
    public void canDealToSelf(){
        dealer.dealToSelf();
        assertEquals(1, dealer.getSizeOfHand());
    }
}
