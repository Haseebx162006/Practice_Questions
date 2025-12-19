public class ConcretePlot extends Plot{
    private double frontw;

    public double getFrontw() {
        return frontw;
    }

    public void setFrontw(double frontw) {
        this.frontw = frontw;
    }

    public ConcretePlot(String id, PlotType plotType, PlotShape plotShape, double frontw, double... dimensions){
       super(id, plotType, plotShape, dimensions);
       this.frontw=frontw;
    }
    @Override
    public double getPrice(){
      return super.getPrice()*1.8;
    }
}
