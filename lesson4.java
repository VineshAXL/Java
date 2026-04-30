import java.io.*;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }
        System.out.println("For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        // Output: Count: 1, Count: 2 ... Count: 5
        System.out.println("While loop");
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }

    }
}