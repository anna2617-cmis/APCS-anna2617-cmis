public class BlackJackApplication
{
    public static void main(String[] args){
        System.out.println("--Dealer--");
        String[] dealer = new String[2];
        int dTotal = 0; 
        for(int a = 0; a < dealer.length; a++){
            BlackJack cards = new BlackJack();
            dTotal += cards.getNum(); 
            if (dTotal > 21){
                dTotal -= 10;  
            }
            dealer[a] = cards.getCard();
            System.out.println(dealer[a]);
        }
        System.out.println("--Player1--");
        String[] player1 = new String[2];
        int p1Total = 0; 
        for(int a = 0; a < player1.length; a++){
            BlackJack cards = new BlackJack();
            p1Total += cards.getNum(); 
            if (p1Total > 21){
                p1Total -= 10; 
            }
            player1[a] = cards.getCard();
            System.out.println(player1[a]);
        }
        System.out.println("--Player2--");
        String[] player2 = new String[2];
        int p2Total = 0; 
        for(int a = 0; a < player2.length; a++){
            BlackJack cards = new BlackJack();
            p2Total += cards.getNum(); 
            if (p2Total > 21){
                p2Total -= 10; 
            }
            player2[a] = cards.getCard();
            System.out.println(player2[a]);
        }
        System.out.println("--Player3--");
        String[] player3 = new String[2];
        int p3Total = 0; 
        for(int a = 0; a < player3.length; a++){
            BlackJack cards = new BlackJack();
            p3Total += cards.getNum(); 
            if (p3Total > 21){
                p3Total -= 10; 
            }
            player3[a] = cards.getCard();
            System.out.println(player3[a]);
        }
        System.out.println("--Player4--");
        String[] player4 = new String[2];
        int p4Total = 0; 
        for(int a = 0; a < player4.length; a++){
            BlackJack cards = new BlackJack();
            p4Total += cards.getNum(); 
            if (p2Total > 21){
                p2Total -= 10;  
            }
            player4[a] = cards.getCard();
            System.out.println(player4[a]);
        }
        System.out.println("--Player5--");
        String[] player5 = new String[2];
        int p5Total = 0; 
        for(int a = 0; a < player5.length; a++){
            BlackJack cards = new BlackJack();
            p5Total += cards.getNum(); 
            if (p5Total > 21){
                p5Total -= 10; 
            }
            player5[a] = cards.getCard();
            System.out.println(player5[a]);
        }

        System.out.format("dealer vs player 1 result: %s%n" +
        "dealer vs player 2 result: %s%n" +
        "dealer vs player 3 result: %s%n" +
        "dealer vs player 4 result: %s%n" +
        "dealer vs player 5 result: %s%n", compare(dTotal, p1Total),compare(dTotal, p2Total),compare(dTotal, p3Total),compare(dTotal, p4Total),compare(dTotal, p5Total));
    }

    public static String compare(int dealer, int player){
        if(player == 21){
            return "player have won!"; 
        }else if (player > dealer){
            return "player have won!"; 
        }else{
            return "dealer have won!"; 
        } 
    }
}
