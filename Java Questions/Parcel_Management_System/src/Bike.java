public class Bike extends Vehicle {
    private double helmet_charges;

    public double getHelmet_charges() {
        return helmet_charges;
    }

    public void setHelmet_charges(double helmet_charges) {
        this.helmet_charges = helmet_charges;
    }

    Bike(String id, String colour, double rent, int days, double helmet_charges){
        super(id,colour,rent,days);
        this.helmet_charges=helmet_charges;
    }
    @Override
    public double calculate_rent(){
        return  super.calculate_rent()+helmet_charges;
    }
}
