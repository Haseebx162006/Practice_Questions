import java.util.Scanner;

public class Student extends Person {
    Scanner sc= new Scanner(System.in);
    public String rollNum;
    Student(String name , String age, int[] marks){
        super(name,age);
        marks= new int[3];
    }
    public void display(){

    }
}
