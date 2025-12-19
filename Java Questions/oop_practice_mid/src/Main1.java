import java.util.Scanner;

public class Main1 {
    public static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks[][];
        int n;
        System.out.println("How many students you want to submit test:");
        n=sc.nextInt();
        Course1 c1= new Course1(n);
        c1.input_marks();
        c1.display();
    }
}