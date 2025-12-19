import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class Cinema {
    Scanner sc= new Scanner(System.in);
    public Seat seat;
    Seat array[][];
    public Cinema(int n){
        array=new Seat[n][n];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]= new Seat();
            }
            System.out.println();
        }

    }
    public void draw(){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                //array[i][j]= new Seat();
                if (array[i][j].isBooked()){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    public void setTruth(){
        int row, column;
        System.out.println("Enter the row:");
        row=sc.nextInt();
        System.out.println("Enter the column:");
        column=sc.nextInt();
        if (!array[row][column].isBooked()){
            array[row][column].setBooked(true);
        }
        else{
            System.out.println("Seat has already booked");
        }
    }
}
