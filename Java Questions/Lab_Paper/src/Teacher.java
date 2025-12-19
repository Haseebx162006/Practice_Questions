public class Teacher extends Person{
    public double salary;
    public String subject;
    Teacher(String name, String age,double salary, String subject){
        super(name,age);
        this.salary=salary;
        this.subject=subject;
    }

}
