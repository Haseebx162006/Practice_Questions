import java.util.Scanner;

public class Parcel {
    Scanner sc= new Scanner(System.in);
    private String parcelId;
    private String sender;
    private String receiver;
    private double weight;
    private boolean isDelieverd;
    private double price;
    private int row;
    private int column;

    public boolean stored;

    @Override
    public String toString() {
        return "Parcel{" +
                "sc=" + sc +
                ", parcelId='" + parcelId + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                ", isDelieverd=" + isDelieverd +
                ", price=" + price +
                ", row=" + row +
                ", column=" + column +
                ", stored=" + stored +
                '}';
    }

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDelieverd() {
        return isDelieverd;
    }

    public void setDelieverd(boolean delieverd) {
        isDelieverd = delieverd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Parcel(){

    }
    public Parcel( String parcelId, String sender, String receiver, double weight, boolean isDelieverd, double price, int row, int column) {
        this.parcelId = parcelId;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.isDelieverd = isDelieverd;
        this.price = price;
        this.row = row;
        this.column = column;
    }

    public void input(){
        System.out.println("Enter the ID:");
        parcelId=sc.nextLine();
        System.out.println("Enter the Sender:");
        sender=sc.nextLine();
        System.out.println("Enter the Receiver:");
        receiver=sc.nextLine();
        System.out.println("Enter the price:");
        price=sc.nextDouble();
        sc.nextLine();
        stored=true;
        isDelieverd=false;
    }

}
