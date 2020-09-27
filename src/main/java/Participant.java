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

    public int getHandValue(){
        int total = 0;
        for (Card card : this.hand){
            total += card.getValueOfEnum();
        }
        return total;
    }

    public boolean checkBust(){
        int total = this.getHandValue();
        if (total > 21){
            return true;
        }
        return false;
    }
}
