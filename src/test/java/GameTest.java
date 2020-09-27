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
    private Card highCard;
    private Card lowCard;

    @Before
    public void  before(){
        deck = new Deck();
        dealer = new Dealer(deck);
        player1 = new Player();
        player2 = new Player();
        game = new Game(dealer, player1, player2);
        highCard = new Card(CardSuit.SPADES, CardValue.ACE);
        lowCard = new Card(CardSuit.DIAMONDS, CardValue.EIGHT);
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

//    @Test
//    public void canFindWinner(){
//        player1.setCard(highCard);
//        player2.setCard(lowCard);
//        Player result = game.determineWinner();
//        assertEquals(player1, result);
//    }

}
