public class Vechile {
     public double speed;
     public double fuel;
     public void display_info(){
         System.out.println("The speed:"+ speed);
         System.out.println("The fuel:"+fuel);
     }

    public Vechile(double speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
}
class Car extends Vechile{
    Car(int speed, int fuel,int doors){
        super(speed,fuel);
        this.doors=doors;
    }
    int doors;
    @Override
    public void display_info(){
        System.out.println("The name of the vechile:"+getClass().getSimpleName());
        System.out.println("The car have "+doors+" doors");
        super.display_info();
    }

}