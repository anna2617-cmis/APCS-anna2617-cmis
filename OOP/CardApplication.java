public class CardApplication
{
    public static void main(String[] args){
       Game game = new Game(); 
       game.addPlayer(); 
       game.addPlayer(); 
       game.addPlayer(); 
       game.setUp(); 
       game.playRound(); 
       game.summary(); 
    }
}
