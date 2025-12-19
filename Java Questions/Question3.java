import java.util.ArrayList;
import java.util.List;

class Calculator<T extends Number & Comparable<T>>{
    private T number1;
    private T number2;
    public Calculator(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public T getNumber1() {
        return number1;
    }
    public void setNumber1(T number1) {
        this.number1 = number1;
    }
    public T getNumber2() {
        return number2;
    }
    public void setNumber2(T number2) {
        this.number2 = number2;
    }
    public double addition(){
        return number1.doubleValue()+number2.doubleValue();
    }
    public double multiplication(){
        return number1.doubleValue()*number2.doubleValue();
    }
    public T max(){
        return (number1.compareTo(number2)>0) ? number1:number2;
    }

}
public class Question3 {
    public static void main(String[] args) {
        Calculator<Integer> inCalculator= new Calculator<Integer>(8, 4);
       // System.out.println(inCalculator.max());
        List list = new ArrayList<String>();
        int a=10;
        list.add(a);
        list.add("Hello");
        list.add(12);
        list.add(838);
        System.out.println(list);
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add(null);
    }
    

}
