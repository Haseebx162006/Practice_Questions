package midpaper;

import java.awt.*;
import java.util.Scanner;

public class Screen {
    Scanner sc= new Scanner(System.in);
    Seat[][] seats;
    Screen(int n){
        seats= new Seat[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<1){
                    seats[i][j]= new Seat(i+""+j,200,"Regular");
                } else if (i==n-1) {
                    seats[i][j]= new Seat(i+""+j,900,"Premium");
                }
                else{
                    seats[i][j]= new Seat(i+""+j,400,"Medium");
                }
            }
        }

    }
    public void SetCheck(){
        int row, column;
        System.out.println("Enter the row");
        row= sc.nextInt();
        System.out.println("Enter the row");
        column=sc.nextInt();
        if (!seats[row][column].isAvaliable()){
            seats[row][column].setAvaliable(true);;
            display();
        } else {
            System.out.println("The seat is Already booked");
        }
    }
    public void draw(){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (!seats[i][j].isAvaliable()) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    public void display(){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if (seats[i][j].isAvaliable()){
                    System.out.println("The id of the ticket"+seats[i][j].getId());
                    System.out.println("The price of the ticket"+seats[i][j].getPrice());
                    System.out.println("The SeatType of the ticket"+seats[i][j].getSeatType());
                }
            }
        }
    }
}
