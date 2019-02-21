public class Student
{
    private String first; 
    private String last; 
    private int classNum; 
    private double gPA; 
    
    public Student(){
        this.first = "Anna"; 
        this.last = "Song"; 
        this.classNum = 8; 
        this.gPA = 3.98; 
    }
    
    public Student(String a, String b, double c){
        this();
        this.first = a; 
        this.last = b; 
        this.gPA = c; 
    }
    
    public String toString(){
        return String.format("%nfirst name:  %s%nlast name:  %s%nnumber of classes:  %d%nGPA:  %f",first, last, classNum, gPA);  
    }  
}
