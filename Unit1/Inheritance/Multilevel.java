package Unit1.Inheritance;

class Animal{
    void eat(){
        System.out.println("I am eating naughh");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Vou Vouu");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("I need milkk mummaaa");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.bark();
        obj.eat();
        obj.weep();
    }
}
