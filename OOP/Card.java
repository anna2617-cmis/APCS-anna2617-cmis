public class Card
{
    private String suit; 
    private String rank; 
    private String card; 
    String [] arSuit = {"club","spade","diamond","heart"}; 
    String [] arRank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    
    public Card(){
        String newSuit = arSuit[(int)(Math.random()*4)];
        String newRank = arRank[(int)(Math.random()*12)]; 
        this.suit = newSuit; 
        this.rank = newRank; 
        this.card = this.suit + this.rank; 
    }
    
    public Card(String newSuit, String newRank){
        this(); 
        this.suit = newSuit; 
        this.rank = newRank; 
    }                                                          

    public String getCard(){ 
        return card; 
    }
    
    public String toString(){
        return String.format("%s,%s,%s",suit,rank,card);  
    }
}
