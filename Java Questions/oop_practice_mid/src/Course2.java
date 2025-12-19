import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course2 {
    Scanner sc= new Scanner(System.in);
    List<Student> s;
    private String courseCode;
    private String courseTitle;
    private String courseCredits;

    public Course2(String courseCode, String courseTitle, String courseCredits) {
        s= new ArrayList<Student>();
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseCredits = courseCredits;
    }
    public void InputMarks(){
        for (int i = 0; i < s.size(); i++) {
            System.out.println("Enter the marks for student"+(i+1));
            s.get(i).setMarks(sc.nextInt());
        }
    }
    public void display_marks(){
        display();
        for (Student s1: s){
            if (s1.getMarks()>80){
                s1.display();
            }
        }
    }
    public  void  display(){
        System.out.println("The coursecode:"+courseCode);
        System.out.println("The coursetitle:"+courseTitle);
        System.out.println("The courseCredithour"+courseCredits);
    }
    public void add_course(Student s1){
        s.add(s1);
    }
}
