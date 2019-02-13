public class ThingApplication
{
    public static void main(String[] args){
        Thing thing1 = new Thing(); // calling the constructor method 
        Thing thing2 = new Thing();
        thing1.setField1(12); 
        thing2.setField1(55);
        System.out.println(thing1.getField1()); 
        System.out.println(thing2.getField1()); 

    }
}
