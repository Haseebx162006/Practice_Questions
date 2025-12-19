import java.util.ArrayList;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        String name,streetcode,street,city;
        double Salary;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        name=sc.nextLine();
        System.out.println("The city:");
        city=sc.nextLine();
        System.out.println("The Street:");
        street=sc.nextLine();
        System.out.println("The Streetcode:");
        streetcode= sc.nextLine();
        System.out.println("The salary");
        Salary=sc.nextDouble();
        Address a= new Address(city,street,streetcode);
        Employee e= new Employee(a,name,Salary);
        Employee e2= new Employee(a,name,Salary);
        Employee e3= new Employee(a,name,Salary);
        employees.add(e);
        employees.add(e2);
        employees.add(e3);
        for(Employee emp: employees){
            emp.display();
        }
    }
}