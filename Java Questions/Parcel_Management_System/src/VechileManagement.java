public class VechileManagement {
    Vehicle vehicles[];
    VechileManagement(int n){
        vehicles= new Vehicle[n];
    }
    public double calculate_total_rent(){
        double sum=0;
        for (Vehicle v: vehicles){
            sum+=v.calculate_rent();
        }
        return sum;
    }
}
