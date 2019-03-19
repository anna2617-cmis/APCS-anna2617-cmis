import java.util.*;
public class Hand
{
    private List<Card> cards; 

    public Hand(){
        cards = new ArrayList<Card>(); 
    }

    public void addCard(Card card){
        cards.add(card); 
    }

    public int getScore(){
        int score = 0;
        for (Card card : cards){
            int rank = card.getRank();
            if (rank == 0){
                if(score + 11 > 21){
                    score += 1; 
                }else{
                    score += 11; 
                }
            } else if (rank < 10){
                score += rank + 1; 
            }else{
                score += 10; 
            }
        }
        return score; 
    }

    public String toString(){
        String out = ""; 
        for (Card card : cards){
            out += card.toString() + " "; 
        }
        return out; 
    }

    public String toString(boolean isDealer){
        String out = ""; 
        for (Card card : cards){
            if (isDealer){
                out += "??" + " "; 
                isDealer = false; 
            }else{
                out += card.toString() + " "; 
            }
        }
        return out; 
    }
}
