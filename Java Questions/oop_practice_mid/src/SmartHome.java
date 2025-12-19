public class SmartHome {
    public static void main(String args[]){
        System.out.println();
        // I will add the devices
        System.out.println("******************** Adding Devices to SmartHome of Haseeb ********************");
        System.out.println();
        Light light= new Light("Philips","L123","15",78);
        Fan fan= new Fan("Master","F118","75",14);
        Thermostat thermostat= new Thermostat("Fouji Materials","T480","5",37.9);

        // Smarthub;
        //Creating object of Smarthub
        SmartHub smartHub= new SmartHub();
        smartHub.AddDevice(light);
        smartHub.AddDevice(fan);
        smartHub.AddDevice(thermostat);
        System.out.println();
        System.out.println("******************** Turning On All devices ********************");
        System.out.println();
        smartHub.ControllAlldevices(true);
        System.out.println();
        System.out.println("******************** Chaning the settings of Devices ********************");
        System.out.println();
        light.adjustBrightness(88);
        fan.adjustFanSpeed(50);
        thermostat.adjustTemperature(40);
        System.out.println();
        System.out.println("******************** All Devices ********************");
        smartHub.ShowAllDevices();
    }
}
