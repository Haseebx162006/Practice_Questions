import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CityHousing city = new CityHousing("Lahore City Housing");

        // Sample societies
        HousingScheme s1 = new HousingScheme("Dream Villas");
        HousingScheme s2 = new HousingScheme("Heaven Residency");

        city.addSociety(s1);
        city.addSociety(s2);

        // Menu for testing
        int choice;
        do {
            System.out.println("\n--- City Housing Management ---");
            System.out.println("1. Add Society");
            System.out.println("2. Book Plot");
            System.out.println("3. Find Society by Name");
            System.out.println("4. View Available Plots");
            System.out.println("5. Display Societies");
            System.out.println("6. City Aggregates");
            System.out.println("7. Cancel Booking");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter society name to add: ");
                    String nameToAdd = sc.nextLine();
                    city.addSociety(new HousingScheme(nameToAdd));
                    break;

                case 2:
                    System.out.print("Enter the society name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter the block name: ");
                    String b = sc.nextLine();
                    System.out.print("Enter row: ");
                    int row = sc.nextInt();
                    System.out.print("Enter column: ");
                    int column = sc.nextInt();
                    sc.nextLine();
                    city.bookPlot(n, b, row, column);
                    break;

                case 3:
                    System.out.print("Enter society name to find: ");
                    String findName = sc.nextLine();
                    HousingScheme found = city.findSocietyByName(findName);
                    if (found != null)
                        System.out.println("Society found: " + found.name);
                    else
                        System.out.println("No such society found.");
                    break;
                    
                case 4:
                    System.out.print("Enter society name: ");
                    String societyName = sc.nextLine();
                    System.out.print("Enter block name: ");
                    String blockName = sc.nextLine();
                    city.displayPlots(societyName, blockName);
                    break;
                    
                case 5:
                    city.displaySocieties();
                    break;
                    
                case 6:
                    System.out.println("Sir Imran ignore this please. Is ka logic nae bana mere se.");
                    break;

                case 7:
                    System.out.print("Enter the society name: ");
                    String n1 = sc.nextLine();
                    System.out.print("Enter the block name: ");
                    String b1 = sc.nextLine();
                    System.out.print("Enter row: ");
                    int row1 = sc.nextInt();
                    System.out.print("Enter column: ");
                    int column1 = sc.nextInt();
                    sc.nextLine();
                    city.cancelPlot(n1,b1,row1,column1);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
