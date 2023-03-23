package Unit1.Concurrency;

//import packageDemo.Mul;

public class Multi extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multi func1 = new Multi();
        Multi func2 = new Multi();
        func1.start();
        func2.start();
    }
    
}
