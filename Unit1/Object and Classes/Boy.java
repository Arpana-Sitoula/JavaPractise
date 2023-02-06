//Example of method overriding
 class Human {
    //overriden method
    public void eat(){
System.out.println("Let's eattt");
    }
}
 public class Boy extends Human{
    //overriding
    public void eat(){
        System.out.println("Let's gooooooooooo");
    }
    public static void main(String[] args) {
        Human obj = new Boy();
        obj.eat();
    }
}
