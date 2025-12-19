import java.util.ArrayList;

public class Employee {
   private Address address;


    public Address getAddress() {
        return address;
    }
    public Employee(Address address,String name, double Salary) {
        this.address = address;
        this.name=name;
        this.Salary=Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

   public void setAddress(Address address){
        this.address=address;
   }
    private String name;
    private double Salary;

    public void display(){
        System.out.println("The name of the employee is:"+name);
        System.out.println("The salary of the employee is:"+Salary);
        System.out.println("The city of Employee is"+address.getCity());
        System.out.println("The Zip code of the Employee is:"+address.getZipcode());
        System.out.println("The Street of the Employee is"+address.getStreet());
    }
}
