public class Person extends Entity
{
    
    public Person(){
        super("default");
    }

    public Person(String name){
        super(name);
    } 

    public void setAge(int age){
       if (age >= 160){
           super.setAge(age); 
       }
    } // rewrite the setter method in entity
    
    public String toString(){
        String out = super.toString(); 
        out += "--> Person"; 
        return out; 
    } 
}
