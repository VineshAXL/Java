import java.io.*;
import java.util.*;

public class lesson2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);   // Addition → 13
        System.out.println(a - b);   // Subtraction → 7
        System.out.println(a * b);   // Multiplication → 30
        System.out.println(a / b);   // Division → 3 (not 3.33!)
        System.out.println(a % b);   // Remainder → 1
//int / int gives a whole number. To get decimals, use double:
        double result = 10.0 / 3;  // → 3.333...
        System.out.println(result);
    }
}