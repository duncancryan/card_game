import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getNumberOfCards(){
        return cards.size();
    }

    public void addCardToDeck(Card card){
        this.cards.add(card);
    }

    // populateDeck()
    // if !cards.contains(card)
        // for suit in suits get each suit
            // for value in values get each value
                //Card card = new Card(suit, value)
                // addCardToDeck(card)
}
