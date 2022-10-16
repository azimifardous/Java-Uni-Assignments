// Imports Scanner class from the java.util library
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
    /* Write a simple Java program EvaluateFunction.java that reads three
       integer variables 𝑥, 𝑦, and 𝑧 from the user and evaluates the outputs
       of 𝑓(𝑥, 𝑦) and 𝑔(𝑥, 𝑦, 𝑧) for given values. The definitions of functions 𝑓(𝑥, 𝑦)
       and 𝑔(𝑥, 𝑦, 𝑧) are as follows: */

        // Making a new Scanner object
        Scanner keyboard = new Scanner(System.in);

        // User's Input as values of x, y, and z
        int x, y, z;

        System.out.println("Enter integer x: ");
        x = keyboard.nextInt();

        System.out.println("Enter integer y: ");
        y = keyboard.nextInt();

        System.out.println("Enter integer z: ");
        z = keyboard.nextInt();

        // declaring the first function as f(x,y)
        double function01 = (x - y) / (x + y) + (3 * x * y);
        int resultFunction01 = (int) Math.round(function01); // converting to integer
        System.out.println("f(" + x + "," + y + ") = " + resultFunction01);

        // declaring the second function as f(x,y,z)
        double function02 = (x * x - y * y) / (x + z) + (x * x + z * z) / (y - z);
        int resultFunction02 = (int) Math.round(function02); // converting to integer
        System.out.println("f(" + x + "," + y + "," + z + ") = " + resultFunction02);


    }
}
