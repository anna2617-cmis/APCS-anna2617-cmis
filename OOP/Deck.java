import java.util.*;
public class Deck
{
    private List<Card> cards; 
    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        while (nDecks -- > 0){
            for (int a = 0; a < 4; a++){
                for (int b = 0; b < 13; b++){
                    cards.add(new Card(a, b));
                }
            }
        }
        System.out.println(cards.size()); 
    }

    public int nCards(){
        return cards.size(); 
    }

    public Card draw(){
        int last = cards.size() - 1; // the size of the list - 1
        return cards.remove(last); 
    }

    public void shuffle(){
        for(int a = 0; a < 100; a++){
            int indexOne = (int)(Math.random() * cards.size()); 
            int indexTwo = (int)(Math.random() * cards.size()); 
            Card c1 = cards.get(indexOne); 
            Card c2 = cards.get(indexTwo); 
            cards.set(indexTwo, c1); 
            cards.set(indexOne, c2);
        }
    }
}