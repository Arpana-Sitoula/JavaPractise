package Unit1.Concurrency;


class HighPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("High priority thread: " + i);
        }
    }
}

class LowPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Low priority thread: " + i);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        HighPriorityThread highPriorityThread = new HighPriorityThread();
        LowPriorityThread lowPriorityThread = new LowPriorityThread();
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
