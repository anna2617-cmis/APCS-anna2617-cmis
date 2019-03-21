public class Student
{   
    private String name; 
    private int grade; 
    
    public Student(String name, int grade){
        this.name = name; 
        this.grade = grade; 
    }
    
    public String toString(){
        String out = String.format("%s%s", name, grade);
        return out;
    }
}
