import java.util.*; 
public class Course
{
    private String name; 
    private double grade; 

    public Course(String name, double grade){
        this.name = name; 
        this.grade = grade; 
    }

    public double gPA(){
        return grade; 
    }

    public String toString(){
        String out = String.format("%s: %f", name, grade);
        return out; 
    }
}
