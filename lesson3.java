import java.io.*;
import java.util.*;

class lesson3{
    public static void main(String[]ars){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = s.nextLine();
        System.out.println("Enter Your Age");
        int age = s.nextInt();

        System.out.println("Hello "+name+ "! Your are " +age + " Years old.");
    }
}