public class CardApplication
{
    public static void main(String[] args){
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
       
        Card[] cards = new Card[52]; 
        num = 0; 
        for (int a = 0; a < 4; a++){
            for (int b = 0; b < 13; b++){
                cards[num] = new Card(a, b);
                num ++; 
            }
        }
        
        for (int c = 0; c < cards.length; c++){
            System.out.println(cards[c]); 
        }
    }
}
