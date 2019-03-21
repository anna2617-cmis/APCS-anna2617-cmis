import java.util.*;
public class School
{
    private List<Student> students;
    
    public School (){
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student student){
        students.add(student); 
    }
    
    public String toString(){
        String out = ""; 
        for (Student student : students){
            out += student.toString() + " "; 
        }
        return out; 
    }
}
