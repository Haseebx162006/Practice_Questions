public class Person {
    private String name;
    private int age;
    private String cnic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    public Person(String name, String cnic, int age) {
        this.name=name;
        this.cnic=cnic;
        this.age=age;
    }
    public void display(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);
        System.out.println("The Cnic:"+cnic);
    }
}
