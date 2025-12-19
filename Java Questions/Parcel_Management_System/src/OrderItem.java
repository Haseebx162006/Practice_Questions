public class OrderItem {
    private String productId;
    private String productName;
    private double productPrice;

    public OrderItem(){

    }
    public OrderItem(String productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void display(){
        System.out.println("The name of Product:"+productName);
        System.out.println("The Id of Product:"+productId);
        System.out.println("The Price of the product:"+productPrice);
    }
}
