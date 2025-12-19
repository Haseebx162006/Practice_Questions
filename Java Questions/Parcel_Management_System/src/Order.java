import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    OrderItem[] orderItems;
    Order(int n){
        orderItems= new OrderItem[n];
        for (int i = 0; i < n; i++) {
            orderItems[i]= new OrderItem();
        }
    }
    public void add_order(){
        System.out.println("Enter your order:");
        for (int i = 0; i < orderItems.length; i++) {
            System.out.println("Enter the Productid:");
            orderItems[i].setProductId(sc.nextLine());
            System.out.println("Enter the productName:");
            orderItems[i].setProductName(sc.nextLine());
            System.out.println("Enter the price:");
            orderItems[i].setProductPrice(sc.nextDouble());
            sc.nextLine();
        }
    }
    public double calculate_total(){
        double sum=0;
        for (OrderItem o: orderItems){
            sum+=o.getProductPrice();
        }
        return sum;
    }

}
