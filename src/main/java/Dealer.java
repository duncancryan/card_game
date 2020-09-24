public class Dealer {

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void deal(Player player){
        Card card = this.deck.removeCard();
        player.setCard(card);
    }
}
