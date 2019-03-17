import java.util.*;
public class Game
{
    private List<Player> players; 
    private Deck deck; 
    public Game(){
        players = new ArrayList<Player>(); 
        players.add(new Player(100000000)); 
    }

    public void setUp(){
        deck = new Deck(1);
        deck.shuffle(); 
    }

    public void addPlayer(){
        players.add(new Player());
    }

    public String playRound(){

    }

    public String summary(){

    }

    public String toString(){
        String out = ""; 
        boolean isDealer = true; 
        int playerNum = 1; 
        for(Player player : players){
            if(isDealer){
                out += String.format("Name: Dealer %n" +
                    "Chips: %s%n Hand: %s%n", +
                    player.getChip(), player.getHand());
                    
                isDealer = false; 
            }else{
                out += String.format("Name: Player%d: %n" +
                    "Chips: %s%n Hand: %s%n", +
                    playerNum, player.getChip(), player.getHand());
                    
                playerNum ++; 
            }
        }
        return out; 
    }
}
