public class Main1 {
    public static void main(String[] args){
        VechileManagement v= new VechileManagement(2);
        v.vehicles[0]= new Car("121","Blue",45,2);
        v.vehicles[1]= new Bike("111","Red",45,2,15);
        System.out.println(v.calculate_total_rent());
    }
}
