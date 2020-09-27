import java.util.ArrayList;

public abstract class Participant {

    private ArrayList<Card> hand;

    public Participant(){
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getSizeOfHand(){
        return this.hand.size();
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }
}
