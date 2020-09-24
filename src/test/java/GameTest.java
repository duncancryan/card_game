import org.junit.Before;

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
        game = new Game(dealer, player1, player2);
        dealer = new Dealer(deck);
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        highCard = new Card(CardSuit.SPADES, CardValue.ACE);
        lowCard = new Card(CardSuit.DIAMONDS, CardValue.EIGHT);
    }
}
