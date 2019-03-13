import java.util.*;
import java.util.Scanner;
public class CardApplication
{
    public static void main(String[] args){
        Deck deck = new Deck(2);
        deck.shuffle(); 
        
        Scanner Scan = new Scanner (System.in); 
        int nHands = Scan.nextInt();

        List<Hand> hands = new ArrayList<Hand>();
        while (nHands -- > 0){
            Hand tempHand = new Hand(); 
            for (int b = 0; b < 2; b++){
                tempHand.addCard(deck.draw());
            }
            hands.add(tempHand); 
        }
        System.out.println(hands); 
        
        System.out.format("dealer vs player 1 result: %s%n" +
        "dealer vs player 2 result: %s%n" +
        "dealer vs player 3 result: %s%n" +
        "dealer vs player 4 result: %s%n" +
        "dealer vs player 5 result: %s%n"); 
    }
}
