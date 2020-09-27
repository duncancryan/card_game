import java.util.ArrayList;

public class Dealer extends Participant{

    private Deck deck;

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
