import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
