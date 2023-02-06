package Unit1.Inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Making animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Barking");
    }
}

public class Simple {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}
