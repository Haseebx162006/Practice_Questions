import org.w3c.dom.ls.LSOutput;

public class WaterConnection {
    private String connectionId;
    private double consumedUnits;

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public double getConsumedUnits() {
        return consumedUnits;
    }

    public void setConsumedUnits(double consumedUnits) {
        this.consumedUnits = consumedUnits;
    }

    public WaterConnection(String connectionId, double consumedUnits) {
        this.connectionId = connectionId;
        this.consumedUnits = consumedUnits;
    }
    public void ShowUsage(){
        System.out.println("The consumed units are:"+consumedUnits);
    }
    public void display(){
        System.out.println("The Id:"+connectionId);
        ShowUsage();

    }

}
