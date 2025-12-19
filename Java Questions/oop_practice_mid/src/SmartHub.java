import java.util.ArrayList;
import java.util.List;

public class SmartHub {
    List<Device> devices;
    SmartHub(){
        devices= new ArrayList<>();
    }
    public void AddDevice(Device d){
        devices.add(d);
        System.out.println(d.getInfo());
    }
    public void RemoveDevice(Device d){
        devices.remove(d);
        System.out.println(d.getInfo());
    }
    public void ShowAllDevices(){

            for(Device d: devices){
                d.DisplayInfo();
                System.out.println();
            }

    }
    public void ControllAlldevices(boolean check){
            for (Device d : devices){
                if (check){
                    d.TurnOn();
                }
                else{
                    d.TurnOff();
                }
            }

    }
}
