import java.util.*;
public class School
{
    private List<Student> students;
    private String name; 
    private double avgGPA;
    public School (String name){
        students = new ArrayList<Student>();
        this.name = name; 
    }
    
    public void addStudent(Student student){
        students.add(student); 
    }
    
    public double getAvgGPA(){
        
        for(Student student : students){
            avgGPA += student.sAvgGPA(); 
        }
        avgGPA = avgGPA / students.size(); 
        return avgGPA; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String toString(){
        String out = String.format("Name: %s\nEnrollement:%d\nThe avg GPA at %s is %f", name, students.size(), name, avgGPA); 
        
        for (Student student : students){
            out += student.toString() + " "; 
        }
        return out; 
    }
    
    public Student getStudents(){
        return students.remove(0);
    }
}
