import java.util.*;
public class Hand
{
    private List<Card> cards; 
    private int score;

    public Hand(){
        cards = new ArrayList<Card>(); 
    }

    public void addCard(Card card){
        cards.add(card); 
    }

    public int getValue(){
        for (Card card : cards){
            score += card.getNum(); 
        }
        return score; 
    }

    public String toString(){
        String out = ""; 
        for (Card card : cards){
            out += card.toString() + " "; // call the toString method in class Card
        }
        return out; 
    }
}
