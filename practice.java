
import java.io.*;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        // Easy — Create variables for your name, age, and city. Print them in a
        // sentence like: "My name is X, I am Y years old, from Z."

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = s.nextLine();
        System.out.println("Enter Your age:");
        int age = s.nextInt();
        System.out.println("Where You From:");
        System.out.println("");
        String city = s.nextLine();
        System.out.println("");
        System.out.println("My name is " + name + " ,I am " + age + " years old, from " + city);

        // Medium — Ask the user to enter two numbers, then print their sum, difference,
        // and product.
        System.out.println("Enter First Number");
        int a = s.nextInt();
        System.out.println("Enter Second Number");
        int b = s.nextInt();
        int c = a + b;
        System.out.println("Sum of A + B is: " + c);

        // Challenge — Ask the user for a number. Use a loop to print its multiplication
        // table (1×N to 10×N).
int count=0;
        for (int i = 1; i <= 10; i++) {
             count = i * a;
            System.out.println(i + " * " + a + " = " + count);
        }
    }
}
