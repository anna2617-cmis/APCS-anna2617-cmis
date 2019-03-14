import java.util.*;
public class Player
{
    private Hand hand;  
    private int chips; 

    public Player(){
        this.hand = new Hand(); 
    }

    public void draw(Deck deck){

        hand.addCard(deck.draw());

    }
}
