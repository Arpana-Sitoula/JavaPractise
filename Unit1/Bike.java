package Unit1;
public class Bike {
    final void run(){
        System.out.println("Running...");
    }
}
class Honda extends Bike{
    public static void main( String args[]){
        Bike b = new Honda();
        b.run();
    }
}
