public class Employee {
    private String name;
    private double salary;

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

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void display_salary(){
        System.out.println("The name is:"+name);
        System.out.println("The type:"+getClass().getSimpleName());
        System.out.println("The Base salary is:"+salary);
    }
}
class Manager extends Employee{
    private double bonus;
    Manager(String name,double salary, double bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double calculate_salary(){
        return (bonus/100)*getSalary();
    }
    @Override
    public void display_salary(){
        super.display_salary();
        System.out.println("The Bonus:"+calculate_salary());
        System.out.println("The total Salary:" + (getSalary() + calculate_salary()));
    }
}
