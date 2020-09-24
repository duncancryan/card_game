import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;
    private Card card;
    private Card card01;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(CardSuit.SPADES, CardValue.ACE);
        card01 = new Card(CardSuit.CLUBS, CardValue.ACE);
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
        deck.populateDeck();
        deck.shuffleDeck();
        assertNotEquals(card, deck.getCards().get(0));
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        Card cardToRemove = deck.getCards().get(0);
        assertEquals(cardToRemove, deck.removeCard());
    }
}
