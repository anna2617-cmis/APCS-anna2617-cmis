import java.util.*; 
public class Student
{   
    private String name; 
    private int grade; 
    private List<Course> courses;
    private double sAvgGPA = 0; 

    public Student(String name, int grade){
        courses = new ArrayList<Course>(); 
        this.name = name; 
        this.grade = grade; 
    }

    public String toString(){
        String out1 = String.format("Name: %s\nGradeLevel: %d\n"+
                "GPA: %f\nCourses\n-------\n", name, grade, sAvgGPA);
        String out2 = ""; 
        int a = 1; 
        for (Course course : courses){
            out2 += a + ")" +  courses.toString(); 
            a++; 
        }
        String out = out1 + out2; 
        return out;
    }

    public void addCourse(Course course){
        courses.add(course); 
    }

    public double sAvgGPA(){
        for (Course course : courses){
            sAvgGPA += course.gPA(); 
        }
        sAvgGPA = sAvgGPA / courses.size();
        return sAvgGPA; 
    }

}
