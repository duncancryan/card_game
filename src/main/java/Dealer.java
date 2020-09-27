import java.util.ArrayList;

public class Dealer extends Participant{

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealToPlayer(Player player){
        Card card = this.deck.removeCard();
        player.addCardToHand(card);
    }

    public void dealToSelf(){
        Card card = this.deck.removeCard();
        this.addCardToHand(card);
    }
//
//    public void firstDeal(Player player){
//        deck.shuffleDeck();
//
//    }
}
