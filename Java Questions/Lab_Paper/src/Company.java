import java.util.Scanner;

public class Company {
    Scanner sc= new Scanner(System.in);
    Empl[] emp;
    public void input(){
         String name;
        double salary;
         String designation;
        emp= new Empl[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the name of employee:");
            name=sc.nextLine();
            System.out.println("designation:");
            designation=sc.nextLine();
            System.out.println("salary");
            salary=sc.nextDouble();
            emp[i]= new Empl(name,salary,designation);
            sc.nextLine();
        }

    }
    public double average(){
        double sum=0;
        for (Empl e: emp){
            sum+=e.getSalary();
        }
        double average=sum/2;
        return average;
    }
    public void display(){
        for (Empl e: emp){
            System.out.println(e.getName());
            System.out.println(e.getSalary());
            System.out.println(e.getDesignation());
        }
    }
}
