import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player();
        player2 = new Player();
        dealer = new Dealer(deck);
    }

    @Test
    public void handStartsAsNull(){
        assertEquals(null, player1.getCard());
    }


}
