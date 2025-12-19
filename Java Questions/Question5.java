public class Question5 {
    void show(int x) {
        System.out.println("Integer: " + x);
    }
    
    void show(double x) {
        System.out.println("Double: " + x);
    }

    public static void main(String[] args) {
       
        Question5 obj = new Question5();
        obj.show(5.0f); 
    }
}
