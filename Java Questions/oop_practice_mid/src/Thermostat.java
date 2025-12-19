public class Thermostat extends  Device{
    double temperature;
    public void adjustTemperature(double temp){
        this.temperature=temp;
        System.out.println("Thermostat temperature set to " + temp+"C");
    }

    // Constructor

    Thermostat(String brand, String modelNumber, String powerRating, double temperature){
        super(brand, modelNumber, powerRating);
        this.temperature=temperature;
    }
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Fan Speed:"+temperature+"C");
    }
}
