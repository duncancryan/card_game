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


    public Participant compareHands(){
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
//    public String playGame() {
//        start game
//        this.dealer.startGame(this.player);
//        get values of both player and dealer and output to console, check for bust, if either bust then other wins, if either blackjack then they win, if both blackjack then push/tie

//        if none of the above ask user if they want to stick or twist, if twist then deal them another card, check for bust or blackjack, and twist dealer if they are below 16

//        check dealer for bust or blackjack if they hit, repeat until player sticks, blackjacks or busts

//    }

}
