public class ResidentialConnection extends  WaterConnection{
    public final double RATE_R=25;
    private double ResTax;
    private double amountPaid;

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public ResidentialConnection(String connectionId, double consumedUnits, double ResTax, double amountPaid){
        super(connectionId,consumedUnits);
        this.ResTax=ResTax;
        this.amountPaid=amountPaid;
    }
    public double getResTax() {
        return ResTax;
    }

    public void setResTax(double resTax) {
        ResTax = resTax;
    }

    public double Calculate_Bill_Residential(){
        return getConsumedUnits()*RATE_R;
    }
    public void Remaining_Bill(double amount){
        System.out.println("The remaining bill is:"+(Calculate_Bill_Residential()-amount));
    }


}
