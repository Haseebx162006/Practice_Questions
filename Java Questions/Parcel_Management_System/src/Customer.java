import java.util.Scanner;

public class Customer {
    String name;
    Scanner sc = new Scanner(System.in);
    Order orders;
    Customer(String name,int n){
        orders=new Order(n);
        this.name=name;
    }

    public void get_slip(){
        System.out.println(orders.calculate_total());
    }
}
