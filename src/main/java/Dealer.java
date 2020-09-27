import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.hand = new ArrayList<>();
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getSizeOfHand(){
        return this.hand.size();
    }

    //    public void deal(Player player){
//        Card card = this.deck.removeCard();
////        player.setCard(card);
//    }
//
//    public void firstDeal(Player player){
//        deck.shuffleDeck();
//
//    }
}
