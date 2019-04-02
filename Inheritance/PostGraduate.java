public class PostGraduate extends Graduate
{
    public PostGraduate(String name, String major, int units){
       super(name, major, units); 
   }
   
   public int calculateTuition(int units){
       int tuition = units * 750; 
       return tuition; 
   } 
}
