import java.util.List;

class Animal {

}
class Dog extends Animal {

}
class Cat extends Animal {

}
public class Question2 {
    public static <T> void printname(List<? extends Animal> list){
        for(Animal a: list){
            System.out.println(a.getClass().getName().toString());
        }
    }
    public static void main(String[] args) {
        List<Animal> list= List.of(new Animal(), new Dog(), new Cat());
        System.out.println(list);
    }
}
