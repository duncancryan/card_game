import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    private Game game;
    private Deck deck;
    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Card highCard1;
    private Card lowCard1;
    private Card highCard2;
    private Card lowCard2;

    @Before
    public void  before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player1 = new Player();
        player2 = new Player();
        game = new Game(dealer, player1, player2);
        highCard1 = new Card(CardSuit.SPADES, CardValue.KING);
        highCard2 = new Card(CardSuit.CLUBS, CardValue.NINE);
        lowCard1 = new Card(CardSuit.DIAMONDS, CardValue.THREE);
        lowCard1 = new Card(CardSuit.HEARTS, CardValue.FIVE);
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, game.getDealer());
    }

    @Test
    public void hasPlayer1(){
        assertEquals(player1, game.getPlayer1());
    }

    @Test
    public void hasPlayer2(){
        assertEquals(player2, game.getPlayer2());
    }

    @Test
    public void canFindWinner(){
        dealer.addCardToHand(highCard1);
        dealer.addCardToHand(highCard2);
        player1.addCardToHand(lowCard1);
        player1.addCardToHand(lowCard2);
        Player result = game.determineWinner();
        assertEquals(dealer, result);
    }

}
