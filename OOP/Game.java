import java.util.*;
public class Game
{
    private List<Player> players; 
    private Deck deck; 
    private Player dealer; 

    public Game(){
        players = new ArrayList<Player>(); 
        deck = new Deck(5); 
        dealer = new Player("Dealer", 1000000); 
    }

    public void setUp(){
        System.out.println("=== Setup === \n"); 
        deck = new Deck(5);
        deck.shuffle(); 
        for (int a = 0; a < 2; a++){
            dealer.draw(deck); 
        }
        System.out.println(dealer.toString(true)); 
        for(Player player : players){
            for (int a = 0; a < 2; a++){
                player.draw(deck); 
            } 
            System.out.println(player);
            player.bet();
        }
    }

    public void addPlayer(){
        Player player = new Player("Player"+players.size(), 1000); 
        players.add(player); 
    }

    public void playRound(){
        System.out.println("=== Play Round === \n");
        for(Player player : players){
            while (player.getHand() <= 15){
                player.draw(deck); 
            } 
            System.out.println(player);
        }
        while(dealer.isDealerDraw() <= 5){
            dealer.draw(deck); 
        }
        System.out.println(dealer); 
    }
}
