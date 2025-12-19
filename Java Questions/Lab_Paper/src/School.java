import java.util.Scanner;

public class School {
    String name,rollnum,age,subject;
    int marks[];
    double salary;
    Student[] s;
    Teacher[] t;
    Scanner sc= new Scanner(System.in);
    public void input_student_data(){
        int n;
        System.out.println("Enter the number of students:");
        n=sc.nextInt();
        sc.nextLine();
        s= new Student[n];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Name:");
            name=sc.nextLine();
            System.out.println("Age:");
            age=sc.nextLine();
            System.out.println("Roll:");
            rollnum=sc.nextLine();
            int m;
            System.out.println("How many subjects");
            m=sc.nextInt();
            int marks[]= new int[m];
            for (int j = 0; j < m; j++) {
                System.out.println("Marks for Test "+(i+1)+":");
                marks[i]=sc.nextInt();
            }
            s[i]= new Student(name,age,marks);
        }

    }
}
