public class Student {
    private String name;
    private String rollNumber;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void display(){
        System.out.println("The name of the student:"+name);
        System.out.println("The Roll number of the student:"+rollNumber);
        System.out.println("The Marks of the student:"+marks);
    }
}
