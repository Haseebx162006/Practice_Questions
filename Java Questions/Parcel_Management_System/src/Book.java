public class Book {
    private String bookName;
    private String ISBN;
    private String Author;
    int row;
    int column;
    private boolean bookisStored=false;
    public boolean isBookisStored() {
        return bookisStored;
    }

    public void setBookisStored(boolean bookisStored) {
        this.bookisStored = bookisStored;
    }

    public Book(){

    }

    public Book(String bookName, String ISBN, String author) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        Author = author;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public void display(){
        System.out.println(bookName);
        System.out.println(Author);
        System.out.println(ISBN);
    }
}
