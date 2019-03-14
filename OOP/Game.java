import java.util.*;
public class Game
{
    private List<Player> players; 
    private Deck deck; 
    public Game(){
        players = new ArrayList<Player>(); 
    }
    
    public Deck SetUp(int deckNum){
         deck = new Deck(deckNum);
         deck.shuffle(); 
         return deck; 
    }
    
    public Player addPlayer(){
    
    }
    
    public String playRound(){
    
    }
    
    public String summary(){
        
    }
}
