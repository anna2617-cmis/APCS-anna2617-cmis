import java.util.*;
public class Player
{
    private Hand hand;  
    private int chips; 
    private String name; 
    private int bet; 

    public Player(String name, int chips, int bet){
        this.name = name; 
        this.chips = chips; 
        this.hand = new Hand(); 
        this.bet = bet; 
    }

    public int bet(){
        chips -= bet; 
        return chips; 
    }

    public String win(Player dealer){
        if(this.hand.getScore() < 21 || dealer.getHand() > 21){
            if(dealer.getHand() > 21){
                chips += 2*bet; 
                return "you won! \n"; 
            }else if (this.hand.getScore() == 21 || this.hand.getScore() > dealer.getHand()){
                chips += 2*bet; 
                return "you won! \n"; 
            }else{
                return "you lost! \n"; 
            } 
        }
        else{
            return "you lost! \n"; 
        }
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
                "Chips: %d%nHand: %s%n", 
                name,chips, hand.toString(true));  
        return out; 
    }
}

