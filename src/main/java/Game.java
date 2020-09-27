public class Game {

    private Dealer dealer;
    private Player player;

    public Game(Dealer dealer, Player player) {
        this.dealer = dealer;
        this.player = player;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Participant determineWinner(){
        int playerTotal = player.getHandValue();
        int dealerTotal = dealer.getHandValue();
        if (dealerTotal > playerTotal){
            return dealer;
        }
        else {
            return player;
        }
    }
//
//    public String playGame(){
//        this.dealer.startGame(this.player);
//        Participant result = this.determineWinner();
//
//
//        if (result == player1){
//            return "Player 1 WINS!!!";
//        }
//        else{
//            return "Player 2 WINS!!!";
//        }
//    }
}
