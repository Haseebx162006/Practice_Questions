class calculator {
    public boolean isPrime(int a) {
        if (a <= 1) return false;
       for (int i = 2; i <=a/2; i++) {
        if (a%i==0) {
            return false;
        }
       }
       return true;
    }
}

public class Main4 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        int number = 4; // Example number to check
        if (calc.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
// ...existing code...
