package midpaper;

public class Seat {
    private String seatType;
    private double price;
    private String id;
    private boolean isAvaliable=false;

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }
    public Seat(){
    }
    public Seat(String id, double price, String seatType){
        this.id=id;
        this.seatType=seatType;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatType='" + seatType + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", isAvaliable=" + isAvaliable +
                '}';
    }
}
