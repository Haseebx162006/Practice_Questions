import java.util.Scanner;

public  class Main{
   public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int n;
       System.out.println("How many courses you want to add:");
       n=sc.nextInt();
       String coursecode,coursetitle,coursecredits;
       Course[] courses= new Course[n];
       sc.nextLine();
       for (int i = 0; i <n; i++) {
           courses[i]= new Course();
           System.out.println("Data for Student"+i);
           System.out.println("Enter the coursecode:");
           coursecode=sc.nextLine();
           courses[i].setCourseCode(coursecode);
           System.out.println("Enter the Courstitle");
           coursetitle=sc.nextLine();
           courses[i].setCourseTitle(coursetitle);
           System.out.println("Enter the Coursecredits:");
           coursecredits=sc.nextLine();
           courses[i].setCourseCredits(coursecredits);
       }
       for (int i = 0; i < courses.length; i++) {
           System.out.println("The daata for Student "+i);
           courses[i].displayInfo();
       }
    }
}