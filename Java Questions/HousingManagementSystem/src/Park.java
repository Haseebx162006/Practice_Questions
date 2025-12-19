import java.awt.*;

public class Park {
    private String id;
    private PlotType plotType;
    private double area;
    private PlotShape plotShape;

    public PlotShape getPlotShape() {
        return plotShape;
    }

    public void setPlotShape(PlotShape plotShape) {
        this.plotShape = plotShape;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlotType getPlotType() {
        return plotType;
    }

    public void setPlotType(PlotType plotType) {
        this.plotType = plotType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Park(String id,double... dimensions){
        this.id=id;
        this.plotType=PlotType.COMM_SHOP;
        this.plotShape=PlotShape.SQUARE;
        Compute_Area(dimensions);
    }
    public void Compute_Area(double... dimensions){
        area=dimensions[0]*dimensions[0];
    }
    public void display() {
        System.out.println("Park Details:");
        System.out.println("ID: " + id);
        System.out.println("Shape: " + plotShape);
        System.out.println("Area: " + area);
        System.out.println("--------------------------------");
    }
}
