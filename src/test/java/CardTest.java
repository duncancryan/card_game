import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(CardSuit.CLUBS, CardValue.ACE);
    }

    @Test
    public void hasSuitOfClubs(){
        assertEquals(CardSuit.CLUBS, card.getCardSuit());
    }

    @Test
    public void hasValueOfAce(){
        assertEquals(CardValue.ACE, card.getCardValue());
    }

    @Test
    public void aceHasValueOf11(){
        assertEquals(11, card.getValueOfEnum());
    }
}
