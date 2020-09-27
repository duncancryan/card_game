import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Deck deck;
    private Dealer dealer;
    private Player player;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
        deck.populateDeck();
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
    public void canDealToPlayer(){
        dealer.dealToPlayer(player);
        assertEquals(1, player.getSizeOfHand());
    }
}
