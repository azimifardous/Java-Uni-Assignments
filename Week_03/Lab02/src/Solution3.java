// Importing the Scanner class from java.util library
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        /* A 4-digit number has 1 digit each in the thousands, hundreds, tens, and
        units position. For example, 5327 has 5 in the thousands position, 3 in the
        hundreds position, 2 in the tens position, and 7 in the units position.
        Write a Java program that takes exactly a 4-digit number and prints the number
        of thousands, hundreds, tens and units. */

        // Let's make a scanner object
        Scanner sc = new Scanner(System.in);

        // Let's declare a variable to store the user's input
        System.out.println("Enter a 4 digit number: ");
        int number = sc.nextInt();

        // Let's declare thousands, hundreds, tens, and units variables
        int thousands, hundreds, tens, units;

        thousands = number / 1000;
        System.out.println("Thousands: " + thousands);

        hundreds = number / 100;
        hundreds = hundreds % 10;
        System.out.println("Hundreds: " + hundreds);

        tens = number / 10;
        tens = tens % 10;
        System.out.println("Tens: " + tens);

        units = number % 10;
        System.out.println("Units: " + units);
    }
}

/* There are also another ways of solving this problem but since we haven't studied those topics
yet in university, I had to use this method and algorithm. */