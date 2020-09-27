import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
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
