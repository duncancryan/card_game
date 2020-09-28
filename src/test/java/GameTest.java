import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    private Game game;
    private Deck deck;
    private Dealer dealer;
    private Player player;
    private Card highCard1;
    private Card lowCard1;
    private Card highCard2;
    private Card lowCard2;

    @Before
    public void  before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player = new Player();
        game = new Game(dealer, player);
        highCard1 = new Card(CardSuit.SPADES, CardValue.KING);
        highCard2 = new Card(CardSuit.CLUBS, CardValue.NINE);
        lowCard1 = new Card(CardSuit.DIAMONDS, CardValue.THREE);
        lowCard2 = new Card(CardSuit.HEARTS, CardValue.FIVE);
        dealer.addCardToHand(highCard1);
        dealer.addCardToHand(highCard2);
        player.addCardToHand(lowCard1);
        player.addCardToHand(lowCard2);
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, game.getDealer());
    }

    @Test
    public void hasPlayer(){
        assertEquals(player, game.getPlayer());
    }

    @Test
    public void canCompareHands(){
        assertEquals(dealer, game.compareHands());
    }

}
