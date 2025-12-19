public class NewParcel {
    private double weight;
    private String destination;
    private double cost;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public NewParcel(double weight, String destination, double cost) {
        this.weight = weight;
        this.destination = destination;
        this.cost = cost;
    }

    public double TotalCost(){
        cost=250*weight;
        return cost;
    }
}
