public class Shop {
    private String Shop_id;
    private double price;
    private boolean isbooked;

    public String getShop_id() {
        return Shop_id;
    }

    public void setShop_id(String shop_id) {
        Shop_id = shop_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }
    public Shop(String Shop_id,double price){
        this.Shop_id=Shop_id;
        this.price=price;
        this.isbooked=false;
    }
    public void display() {
        System.out.println("Shop Details:");
        System.out.println("Shop ID: " + Shop_id);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isbooked? "Booked" : "Available"));
        System.out.println("--------------------------------");
    }
}
