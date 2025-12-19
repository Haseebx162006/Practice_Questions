import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main{
    static void main() {
        Scanner sc= new Scanner(System.in);
        parcelSystem p = new parcelSystem(5);
        while (true){
            System.out.println("Enter 1 for add parcel");
            System.out.println("Enter 2 for deliever the parcel");
            System.out.println("Enter 3 for searching parcel by id:");

            int n;
            System.out.println("Enter the choice:");
            n=sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Add the details");
                    System.out.println("Enter the row:");
                    int row=sc.nextInt();
                    System.out.println("Enter the column:");
                    int column=sc.nextInt();
                    p.check_position(row,column);
                    break;
                case 2:
                    int row1=sc.nextInt();
                    System.out.println("Enter the column:");
                    int column1=sc.nextInt();
                    p.setstate(row1,column1);
                    break;
                case 3:
                    sc.nextLine();
                    String id;
                    System.out.println("Enter the id:");
                    id=sc.nextLine();
                    p.getDetails(id);
                    break;
            }
        }
    }
}