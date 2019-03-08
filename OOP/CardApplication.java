public class CardApplication
{
    public static void main(String[] args){
        /**
        Card[] Randomcards = new Card[52]; 
        int num = 0; 
        for (int a = 0; a < Randomcards.length; a++){
        Card card = new Card(); 
        for (int b = 0; b < num; b++){
        if (Randomcards[b] == card){
        card = new Card(); 
        }
        }
        Randomcards[a] = card; 
        num ++; 
        }
         **/
        Card[] deck = new Card[52]; 
        int num = 0; 
        for (int a = 0; a < 4; a++){
            for (int b = 0; b < 13; b++){
                deck[num] = new Card(a, b);
                num ++; 
            }
        }
        /**
        for (Card cards : deck){
        System.out.println(cards); 
        }
         **/
        Hand hand = new Hand(); 
        int score = hand.getScore();
        while(score < 21){
            hand.addCard(deck[(int)(Math.random()*52)]);
            score = hand.getScore();
        }

        //System.out.println(score);
        //System.out.println(hand); 

        Deck decks = new Deck(2); 
        while (decks.nCards() > 0){
            System.out.println(decks.draw()); 
        }
    }
}
