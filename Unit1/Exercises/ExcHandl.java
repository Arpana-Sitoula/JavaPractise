// Write a program handling exception using all the keywords: try, catch, throws, throw and finally
package Unit1.Exercises;

import java.util.Scanner;

public class ExcHandl {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        try {
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            if (num2 == 0) {
                throw new Exception("Cannot divide by zero!");
            }
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}
