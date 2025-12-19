import org.w3c.dom.ls.LSOutput;

public class CommercialConnection extends WaterConnection{
    public double RATE_C=25;
    private double ComTax;
    private double amountPaid;
    public CommercialConnection(String connectionId, double consumedUnits,double ComTax,double amountPaid){
        super(connectionId,consumedUnits);
        this.ComTax=ComTax;
        this.amountPaid=amountPaid;
    }

    public double getComTax() {
        return ComTax;
    }

    public void setComTax(double comTax) {
        ComTax = comTax;
    }

    public double Calculate_Bill_Commercial(){
        return getConsumedUnits()*RATE_C;
    }
    public double Remaining_Bill(){
       return Calculate_Bill_Commercial()-amountPaid;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Commercial tax:"+ComTax);
        System.out.println("Total Bill:"+Calculate_Bill_Commercial());
        System.out.println("Paid:"+amountPaid);
        System.out.println("Remaining Bill:"+Remaining_Bill());
    }

}
