import java.util.*;
public class Player
{
    private Hand hand;  
    private int chips; 
    private String name; 
    private int bet; 

    public Player(String name, int chips){
        this.name = name; 
        this.chips = chips; 
        this.hand = new Hand(); 
        this.bet = 10; 
    }

    public int bet(){
        chips -= bet; 
        return chips; 
    }
    
    public int win(){
        chips += 2*bet; 
        return chips; 
    }

    public int getHand(){
        return hand.getScore(); 
    }
    
    public int isDealerDraw(){
        return hand.getDealerDraw(); 
    }

    public void draw(Deck deck){
        hand.addCard(deck.draw());
    }

    public String toString(){
        String out =  String.format("Name: %s%n" +
                "Chips: %d%nHand: %s%nBet: %d%n", 
                name, chips, hand, bet);  
        return out; 
    }

    public String toString(boolean isDealer){
        String out =  String.format("Name: %s%n" +
                "Chips: %d%nHand: %s%nBet: %d%n", 
                name,chips, hand.toString(true), bet);  
        return out; 
    }
}

