public class CommercialMarket {
    private String Commercial_id;
    Shop[] shops;
    public String getCommercial_id() {
        return Commercial_id;
    }

    public void setCommercial_id(String commercial_id) {
        Commercial_id = commercial_id;
    }
    CommercialMarket(String id,int n){
        int count=0;
        this.Commercial_id=id;
        shops= new Shop[n];
        for (int i = 0; i < shops.length; i++) {
            shops[i]=new Shop("S"+count,1200000);
            count++;
        }
    }
    public void buyShop(String shopId) {
        boolean found = false;

        for (Shop shop : shops) {
            if (shop.getShop_id().equalsIgnoreCase(shopId)) {
                found = true;
                if (shop.isIsbooked()){
                    System.out.println("Shop is ALready Booked");
                }
                else{
                    shop.setIsbooked(true);
                    System.out.println("Shop is booked");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("No shop found with ID:" + shopId);
        }
    }
    public void sellShop(String shopId) {
        boolean found = false;
        for (Shop shop : shops) {
            if (shop.getShop_id().equalsIgnoreCase(shopId)) {
                found = true;
                if (shop.isIsbooked()){
                    shop.setIsbooked(false);
                    System.out.println("Shop is Selled");
                }
                else{
                    System.out.println("Shop is not booked hence cant be saled");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("No shop found with ID:" + shopId);
        }
    }
    public void display(){
        for (Shop s: shops){
            s.display();
        }
    }

}
