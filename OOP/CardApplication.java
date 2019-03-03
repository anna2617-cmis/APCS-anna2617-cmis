public class CardApplication
{
    public static void main(String[] args){
        String[] myHand = new String[3];
        for(int a = 0; a < myHand.length; a++){
            Card cards = new Card();
            myHand[a] = cards.getCard();
            System.out.println(myHand[a]);
        }
    }
}
