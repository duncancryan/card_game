import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
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
}
