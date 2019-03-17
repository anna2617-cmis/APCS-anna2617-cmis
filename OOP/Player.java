import java.util.*;
public class Player
{
    private Hand hand;  
    private int chips; 

    public Player(){
        this.hand = new Hand(); 
        this.chips = 1000; 
    }

    public Player(int chips){
        this(); 
        this.chips = chips; 
    }
    
    public int getChip(){
        return chips; 
    }
    
    public Hand getHand(){
        return hand; 
    }

    public void draw(Deck deck){
        hand.addCard(deck.draw());
    }

    
}
