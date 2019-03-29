import java.util.*; 
public class EntityApplication
{
   public static void main(String[] args){
       /**
       Entity e1 = new Entity("entity 1");
       p(e1); 
       Thing t1 = new Thing(); 
       p(t1); 
       Person p1 = new Person(); 
       p(p1);
       **/
       
       List <Entity> entities = new ArrayList<Entity>(); 
       
       Person person = new Person("Kes"); 
       Place place = new Place("Chiang Mai"); 
       Thing thing = new Thing("clock"); 
       Idea idea = new Idea("CCP"); 
       
       entities.add(person); 
       entities.add(place); 
       entities.add(thing); 
       entities.add(idea); 
   }
   
   public static void p(Object string){
       System.out.println(string); 
   }
}
