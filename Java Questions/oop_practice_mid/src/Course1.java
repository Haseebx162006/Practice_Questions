import java.util.Scanner;

public class Course1 {
    Scanner sc= new Scanner(System.in);
    private String courseTitle;
    int[][] marks;
    Course1(int noOfStudents){
        marks= new int[noOfStudents][];
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void input_marks(){
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the Course title");
            int n;
            System.out.println("How many tests for student:");
            n=sc.nextInt();
            marks[i]= new int[n];
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter the Marks for Test "+(j+1));
                marks[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }
    }
    public void display(){
        for (int i = 0; i < marks.length; i++) {
            System.out.println("The Course "+getCourseTitle());
            System.out.println("The marks for student"+(i+1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
