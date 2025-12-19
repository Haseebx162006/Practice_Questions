import java.util.Scanner;

public class Marks {
    Scanner sc= new Scanner(System.in);
    int marks[];
    public void input_marks(){
        int n;
        System.out.println("Enter the tests:");
        n=sc.nextInt();
        marks= new int[n];
        for (int i = 0; i < n; i++) {
            marks[i]= sc.nextInt();
        }
    }
}
