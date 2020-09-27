public class Game {

    private Dealer dealer;
    private Player player1;
    private Player player2;

    public Game(Dealer dealer, Player player1, Player player2) {
        this.dealer = dealer;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

//    public Player determineWinner(){
//        Card player1Card = player1.getCard();
//        Card player2Card = player2.getCard();
//        if (player1Card.getValueOfEnum() > player2Card.getValueOfEnum()){
//            return player1;
//        }
//        else{
//            return player2;
//        }
//    }

//    public String playGame(){
//        this.dealer.getDeck().populateDeck();
//        this.dealer.getDeck().shuffleDeck();
//        this.dealer.deal(player1);
//        this.dealer.deal(player2);
//        Player result = this.determineWinner();
//        if (result == player1){
//            return "Player 1 WINS!!!";
//        }
//        else{
//            return "Player 2 WINS!!!";
//        }
//    }
}
