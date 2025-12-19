import java.util.ArrayList;
import java.util.List;

public class Department {
    public static int TotalStudents=0;
    public static int TotalTechers=0;
    private String name;
    List<Teacher> teachers;
    List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Department(String name){
        this.name=name;
        teachers= new ArrayList<>();
        students= new ArrayList<>();
    }
    public void AddTeacher(Teacher t){
        teachers.add(t);
    }
    public  void AddStudent(Student s){
        TotalStudents++;
        students.add(s);
    }
    public void Show_departmentdetails(){
        System.out.println("The teachers details");
        for (Teacher t: teachers){
            t.display();
        }
        System.out.println("Student Details:");
        for (Student s: students){
            s.display();
        }
    }
    public void SearchRollnum(String roll){
        for (Student s:students ){
            if (s.getRollNumber().equalsIgnoreCase(roll)){
                s.display();
            }
        }
    }
}
