import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(CardSuit.SPADES, CardValue.ACE);
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.getNumberOfCards());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCardToDeck(card);
        assertEquals(1, deck.getNumberOfCards());
    }

    @Test
    public void canFillDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void canShuffleDeck(){
        card = new Card(CardSuit.CLUBS, CardValue.ACE);
        deck.populateDeck();
        deck.shuffleDeck();
        assertNotEquals(card, deck.getCards().get(0));
    }
}
