import java.util.Scanner;

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
    public String playGame() {
//        start game
        this.dealer.startGame(this.player);
//        get values of both player and dealer and output to console, check for bust, if either bust then other wins, if either blackjack then they win, if both blackjack then push/tie
        if (player.checkBlackJack() && dealer.checkBlackJack()){
            System.out.println("Push. No Winner.");
        }
        else if (player.checkBlackJack()){
            System.out.println("BlackJack! Player Wins!");
        }
        else if (player.checkBust()){
            System.out.println("Bust! Dealer Wins!");
        }
        else if (dealer.checkBlackJack()){
            System.out.println("BlackJack! Dealer Wins");
        }
        else if (dealer.checkBust()){
            System.out.println("Bust! Player Wins");
        }
        else{
            System.out.println("Player hand: " + player.getHandValue());
            System.out.println("Dealer hand: " + dealer.getHandValue());
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Stick or Twist?");
            String choice = playerChoice.nextLine().toLowerCase();
            if (choice.equals("stick") && player.getHandValue() < dealer.getHandValue()){
                System.out.println("Dealer Wins!");
            }
            else if (choice.equals("stick") && dealer.getHandValue() < player.getHandValue() && dealer.getHandValue() < 16){
                dealer.dealToSelf();
                if (dealer.checkBlackJack()){
                    System.out.println("BlackJack! Dealer Wins");
                }
                else if (dealer.checkBust()) {
                    System.out.println("Bust! Player Wins");
                }
                else if (dealer.getHandValue() < player.getHandValue()){
                    System.out.println("Player Wins!");
                }
                else if (player.getHandValue() < dealer.getHandValue(){
                    System.out.println("Dealer Wins!");
                }
            }
            else if (choice.equals("twist")){
//                you left off here
            }

        }
//        if none of the above ask user if they want to stick or twist, if twist then deal them another card, check for bust or blackjack, and twist dealer if they are below 16

//        check dealer for bust or blackjack if they hit, repeat until player sticks, blackjacks or busts

//        compare final hands if neither has bust or blackjacked and return winner

    }

}
