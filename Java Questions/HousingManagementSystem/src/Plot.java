enum PlotType {
    RES_5_MARLA(400000),
    RES_10_MARLA(800000),
    RES_1_KANAL(1500000),
    COMM_SHOP(1000000),
    COMM_OFFICE(1200000),
    PARKING(800000);
    private int price;
    PlotType(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
enum PlotShape {
    SQUARE,
    RECTANGULAR,
    L_SHAPE;
}

public class Plot {
    private String id;
    private boolean booked;
    private PlotType plotType;
    private PlotShape plotShape;
    private double area;
    private double price;


    private double width, depth;
    private double front, back;
    private double w1, d1, w2, d2;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public PlotType getPlotType() {
        return plotType;
    }

    public void setPlotType(PlotType plotType) {
        this.plotType = plotType;
    }

    public PlotShape getPlotShape() {
        return plotShape;
    }

    public void setPlotShape(PlotShape plotShape) {
        this.plotShape = plotShape;
    }

    public Plot(String id,PlotType plotType,PlotShape plotShape,double... dimensions){
        this.id=id;
        this.plotType=plotType;
        this.plotShape=plotShape;
        ComputeArea(dimensions);


    }
    public void computePrice(){
        price=area*plotType.getPrice();
    }
    public void ComputeArea(double... dimensions){
        switch (plotShape){
            case RECTANGULAR:
                width = dimensions[0];
                depth = dimensions[1];
                area = width * depth;
                break;
            case L_SHAPE:
                w1 = dimensions[0];
                d1 = dimensions[1];
                w2 = dimensions[2];
                d2 = dimensions[3];
                area = (w1 * d1) + (w2 * d2);
                break;
            case  SQUARE:
                double side = dimensions[0];
                area = side * side;
                break;
        }
        computePrice();
    }
}
