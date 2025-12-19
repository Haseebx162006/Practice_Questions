import java.util.Scanner;

enum BookType{
    HORROR,FICTION,SCIENTIFIC;
        }
public class BookManagement {
    Scanner sc= new Scanner(System.in);
    Book[][] book;
    BookManagement(int n){
        book= new Book[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                book[i][j]= new Book();
            }
        }
    }
    public void book_input(int row, int column){
        System.out.println("Entre name:");
        book[row][column].setBookName(sc.nextLine());
        System.out.println("ISBN:");
        book[row][column].setISBN(sc.nextLine());
        System.out.println("Author:");
        book[row][column].setAuthor(sc.nextLine());
        book[row][column].row=row;
        book[row][column].column=column;
        book[row][column].setBookisStored(true);
    }
    public void bookAdd(){
        sc.nextLine();
        int row=sc.nextInt();
        int column= sc.nextInt();
        if (check(row,column)) {
            book_input(row,column);
        }
        else{
            System.out.println("Booked");
        }

    }
    public boolean check(int row, int column){
        if(book[row][column].isBookisStored()){
            return  false;
        }
        else{
            return true;
        }
    }
}
