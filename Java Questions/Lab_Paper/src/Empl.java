public class Empl {
//    Problem Statement:
//    Create a class Employee with name, salary, and designation.
//    Create a class Company which contains an array of 10 Employees.
//    Write functions to:
//    Input details of all employees.
//    Find and display employees whose salary is above average.
//    Display the employee with the lowest salary.
    private String name;
    private double salary;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Empl(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
