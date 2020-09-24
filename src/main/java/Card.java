public class Card {

    private CardSuit cardSuit;
    private CardValue cardValue;

    public Card(CardSuit cardSuit, CardValue cardValue){
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public int getValueOfEnum(){
        return this.cardValue.getValue();
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }
}
