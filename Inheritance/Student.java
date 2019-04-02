public abstract class Student
{
    private String name; 
    private String major; 
    private int units; 
    
    public Student(String name, String major, int units){
        this.name = name; 
        this.major = major; 
        this.units = units; 
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setmajor(String major){
        this.major = major;
    }
    
    public void setunits(int units){
        this.units = units;
    }
    
    public String getName(){
        return name; 
    }
    
    public String getMajor(){
        return major; 
    }
    
    public int getUnits(){
        return units; 
    }
    
    abstract public int calculateTuition(int units);
}
