import java.util.Scanner;
import java.util.*;
public class TheSystem
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        boolean another = true;
        Student last = null;
        while(another){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade Level: ");
            int gradeLevel = Integer.parseInt(scanner.nextLine());
            Student student = new Student(name, gradeLevel);
            school.addStudent(student);
            System.out.print("Add a student? ");
            another = scanner.nextLine().equals("y");
        }     
        System.out.println(school);
    }
}