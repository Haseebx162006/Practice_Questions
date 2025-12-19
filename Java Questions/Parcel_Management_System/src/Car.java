public class Car extends Vehicle{
    Car(String id, String colour, double rent, int days){
        super(id,colour,rent,days);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("The Vehicle type:"+getClass().getSimpleName());
        System.out.println("The cost of your ride:");
    }
}
