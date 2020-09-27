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
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(deck, dealer.getDeck());
    }

    @Test
    public void dealerDeckIsPopulated(){
        deck.populateDeck();
        int deckNum = dealer.getDeck().getNumberOfCards();
        assertEquals(52, deckNum);
    }

//    @Test
//    public void canDealCard(){
//        deck = new Deck();
//        dealer = new Dealer(deck);
//        deck.populateDeck();
//        Card card = deck.getCards().get(0);
//        dealer.deal(player);
//        assertEquals(card, player.getCard());
//    }
}
