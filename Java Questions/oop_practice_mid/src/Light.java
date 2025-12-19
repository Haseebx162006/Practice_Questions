public class Light extends  Device{
    int brightnessLevel;
    public void adjustBrightness(int level){
        brightnessLevel= level;
        System.out.println("light brightness is set to " + brightnessLevel+"%");
    }

    // Constructor

    Light(String brand, String modelNumber, String powerRating, int brightnessLevel){
        super(brand, modelNumber, powerRating);
        this.brightnessLevel=brightnessLevel;
    }
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Brightness:"+brightnessLevel+"%");
    }

}
