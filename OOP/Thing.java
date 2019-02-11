public class Thing
{
    private int field1 = 10; 
    private double field2 = 4.3; 
    private boolean field3 = false; 
    private String field4 = "hello"; 
    //private instance variable is only accessible inside this class definition
    
    //initial set up of the instance 
    public Thing(){
        this.field1 = 420; 
        this.field2 = 8.5; 
        this.field3 = true; 
        this.field4 = "bye"; 
    }
    
    //setter mathod
    public void setField1(int newValue){ 
        this.field1 = newValue; // 'this' refers to the instance that is calling the method  
    }
    public void setField2(double newValue){
        this.field2 = newValue; 
    }
    public void setField3(boolean newValue){
        this.field3 = newValue; 
    }
    public void setField4(String newValue){
        this.field4 = newValue; 
    }
    
    // getter method 
    public int getField1(){ 
        return field1; 
    }
    public double getField2(){
        return field2; 
    }
    public boolean getField3(){
        return field3; 
    }
    public String getField4(){
        return field4; 
    }
}

