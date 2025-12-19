public class ExpressParcel extends NewParcel{
    public int getDelieverytime() {
        return delieverytime;
    }

    public void setDelieverytime(int delieverytime) {
        this.delieverytime = delieverytime;
    }

    private int delieverytime;
    ExpressParcel(double weight, String destination, double cost,int delieverytime){
        super(weight,destination,cost);
        this.delieverytime=delieverytime;

    }
}
