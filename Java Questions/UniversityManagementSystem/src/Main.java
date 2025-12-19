public class Main{
    public static void main(String[] args){
        Teacher t1= new Teacher("Haseeb",19,"35102","Pf","121");
        Teacher t2= new Teacher("Ali",19,"35102","oop","121");
        Student s1= new Student("Ahmad",11,"41213",1,3.93,"121");
        Student s2= new Student("Hammad",11,"41213",1,3.93,"122");
        Course c1= new Course("111","Eng","2");
        Course c2= new Course("123","Chem","4");
        s1.addcourse(c1);
        s2.addcourse((c2));
        t1.addcourse(c2);
        t2.addcourse(c1);
        Department d= new Department("Computer Science");
        d.AddTeacher(t1);
        d.AddTeacher(t2);
        d.AddStudent(s1);
        d.AddStudent(s2);
        d.SearchRollnum("121");
    }
}