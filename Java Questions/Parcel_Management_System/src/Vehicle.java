public class Vehicle {
    private String id;
    private String colour;
    private double rent;
    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Vehicle(String id, String colour, double rent, int days) {
        this.id = id;
        this.colour = colour;
        this.rent = rent;
        this.days=days;
    }
    public double calculate_rent(){
        return rent*days;
    }
    public void display(){
        System.out.println("The id of the Vechile is:"+id);
        System.out.println("The rent of the vechile is:"+rent);
        System.out.println("The colour of the vechileis:"+colour);
    }
}
