public class Entity
{
    private String name; 
    private int age;

    public Entity (String name){
        this.name = name; 
    }

    public void changeName(String newName){
        this.name = newName; 
    }

    public String getName(){
        return name; 
    }

    public void setAge(int age){
        this.age = age; 
    }

    public int getAge(){
        return age; 
    }

    public String toString(){
        return String.format("%s %s %s",  super.toString(), name, "Enity"); 
    }
}
