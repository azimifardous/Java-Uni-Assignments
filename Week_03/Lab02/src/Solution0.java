// Imports Scanner class from the java.util library
import java.util.Scanner;

public class Solution0 {
    public static void main(String[] args) {
        /* Write a Java program that receives distance in miles
        and converts it into kilometers using the following
        conversion.
        1 mile = 1.609344 kilometers. */

        // Making a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Assuming that the input will be a float number.
        System.out.println("Please distance in miles: ");
        double miles = keyboard.nextDouble(); // variable declaration

        // declaring another variable to store the converted value
        double kilometers = miles * 1.609344;
        int resultInKilometers = (int) Math.round(kilometers); // converting to integer

        // printing out the result
        System.out.println(miles + " miles is equal to " + resultInKilometers + " kilometers.");
    }
}
