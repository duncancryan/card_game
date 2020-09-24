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

    public void populateDeck(){
        CardSuit[] cardSuits = CardSuit.values();
        CardValue[] cardValues = CardValue.values();

        for(CardSuit suit : cardSuits){
            for(CardValue value : cardValues){
                Card card = new Card(suit, value);
                addCardToDeck(card);
            }
        }
    }
}
