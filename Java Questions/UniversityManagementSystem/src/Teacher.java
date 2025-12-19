import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private String teacher_id;
    private String subject;
    List<Course> Teacher_course;
    public Teacher(String name, int age, String cnic,String subject, String teacher_id ){
        super(name,cnic,age);
        this.subject=subject;
        this.teacher_id=teacher_id;
        Teacher_course= new ArrayList<>();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Teacherid:"+teacher_id);
        System.out.println("Subject:"+subject);
        System.out.println("Course details");
        for (Course c: Teacher_course){
            c.display_course();
        }
    }
    public void addcourse(Course c){
        Teacher_course.add(c);
    }
    public void removeCOurse(Course c){
        Teacher_course.remove(c);
    }

}
