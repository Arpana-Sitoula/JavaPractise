//example of method overloading

public class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }



    public static void main(String[] args) {
    OverloadingExample operations = new OverloadingExample();
        System.out.println(operations.add(2, 3));
        System.out.println(operations.add(2.5, 3.5));
    }
}

