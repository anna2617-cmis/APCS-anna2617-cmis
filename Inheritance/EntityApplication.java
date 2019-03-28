import java.util.*; 
public class EntityApplication
{
   public static void main(String[] args){
       Entity e1 = new Entity("entity 1");
       p(e1); 
       Thing t1 = new Thing(); 
       p(t1); 
       Person p1 = new Person(); 
       p(p1);
   }
   
   public static void p(Object string){
       System.out.println(string); 
   }
}
