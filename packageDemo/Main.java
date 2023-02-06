package packageDemo;

public class Main {
    public static void main(String[] args){
        ThreadingUse threadingUse1 = new ThreadingUse();
        ThreadingUse threadingUse2 = new ThreadingUse();
        System.out.println(threadingUse1.getName() + ": " + threadingUse1.getState());
        System.out.println(threadingUse2.getName() + ": " + threadingUse2.getState());
        threadingUse1.start();
        System.out.println(threadingUse1.getName() + ": " + threadingUse1.getState());
        System.out.println(threadingUse2.getName() + ": " + threadingUse2.getState());
        while(threadingUse1.isAlive())
        {
            System.out.println("Waiting....");
        }
        threadingUse2.start();
        System.out.println(threadingUse2.getName() + ": " + threadingUse1.getState());
        System.out.println(threadingUse2.getName() + ": " + threadingUse2.getState());
    }
}

class ThreadingUse extends Thread
{
    @Override
    public void run() {
        super.run();
        System.out.println("Started");
    }
}
