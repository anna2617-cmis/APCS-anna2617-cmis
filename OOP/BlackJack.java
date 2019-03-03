public class BlackJack
{
    private String suit; 
    private String rank; 
    private String card; 
    private int number; 
    String [] arSuit = {"club","spade","diamond","heart"}; 
    String [] arRank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public int CardIndex(String searRank, String[] searArr){
        for (int a = 0; a < searArr.length; a++){
            if (searArr[a] == searRank){
                if (a == 0){
                    return 11;
                }else if (a > 9){
                    return 10; 
                }else{
                    return a; 
                }
            }
        }
        return -1; 
    }
    
    public BlackJack(){
        String newSuit = arSuit[(int)(Math.random()*4)];
        String newRank = arRank[(int)(Math.random()*12)]; 
        this.suit = newSuit; 
        this.rank = newRank; 
        this.number = CardIndex(this.rank, arRank) + 1; 
        this.card = this.suit + this.rank; 
    }                                                      

    public String getCard(){ 
        return card; 
    }

    public int getNum(){ 
        return number; 
    } 
    
    public String toString(){
        return String.format("%s,%s,%s",suit,rank,card);  
    }
}
