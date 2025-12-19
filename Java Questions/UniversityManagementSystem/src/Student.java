import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String rollNumber;
    private double cgpa;
    private int semester;
    List<Course> Student_course;
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Student(String name, int age, String cnic,int semester, double cgpa, String rollNumber){
        super(name,cnic,age);
        this.rollNumber=rollNumber;
        this.cgpa=cgpa;
        this.semester=semester;
        Student_course= new ArrayList<>();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Rollnumber:"+rollNumber);
        System.out.println("Semster:"+semester);
        System.out.println("cgpa:"+cgpa);
        System.out.println("Course details");
        for (Course c: Student_course){
            c.display_course();
        }
    }
    public void addcourse(Course c){
        Student_course.add(c);
    }
    public void removeCOurse(Course c){
        Student_course.remove(c);
    }
}
