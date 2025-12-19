public class Fan extends Device{
    int fanSpeed;
    public void adjustFanSpeed(int speed){
        fanSpeed= speed;
        System.out.println("Fan speed set to " + speed+"%");
    }

    // Constructor

    Fan(String brand, String modelNumber, String powerRating, int fanSpeed){
        super(brand, modelNumber, powerRating);
        this.fanSpeed=fanSpeed;

    }
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Fan Speed:"+fanSpeed+"%");
    }

}
