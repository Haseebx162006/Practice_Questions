public class Main3
{
    public static void main(){
        Student s1= new Student("Haseeb","123");
        Student s2= new Student("Hussain","123");
        Student s3= new Student("Ali","123");
        Course2 c2= new Course2("CSC121","Pf","4");
        c2.add_course(s1);
        c2.add_course(s2);
        c2.add_course(s3);
        c2.InputMarks();
        c2.display_marks();
    }
}
