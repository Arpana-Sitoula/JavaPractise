/*Java does not support multiple inheritance, which means that a class cannot inherit from more than one superclass.
 However, it does provide an alternative mechanism to achieve similar functionality, called interface implementation.
 */
package Unit1.Inheritance;

interface Shape {
    void draw();
}

interface Color {
    void fill();
}

class Circle implements Shape, Color {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void fill() {
        System.out.println("Filling the Circle with color");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.fill();
    }
}
