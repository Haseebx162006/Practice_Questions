public class Device {
    // Here I define the attributes

    String brand;
    String modelNumber;
    String powerRating;


    // Here i define the Methodss of the class
    public void TurnOn(){
        System.out.println(brand+" "+modelNumber+" is ON");
    }
    public void TurnOff(){
        System.out.println(brand+" "+modelNumber+" is OFF");
    }
    public void DisplayInfo(){
        System.out.println("Device:"+brand+" "+modelNumber+"|"+"Power:"+powerRating+"W");
    }

    // Constructor

    public Device(String brand,String modelNumber, String powerRating ) {
        this.brand = brand;
        this.modelNumber=modelNumber;
        this.powerRating=powerRating;
    }
    // for short formatting
    public String getInfo() {
        return getClass().getSimpleName() +
                " [Brand: " + brand +
                ", Model: " + modelNumber +
                ", Power: " + powerRating + "W]";
    }
}
