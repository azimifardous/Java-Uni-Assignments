// importing Scanner class from the java.util library
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        /* Write a Java program which:
            1. Reads number of 1TL, 5TL, 10TL and 20TL.
            2. Computes and prints total amount money.
            3. Displays the total amount of money in terms
                of number of 20TLs and the remaining number of 1TLs.
         */

        // Let's make a new Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Let's take the inputs and store them in variables
        System.out.println("Number of 1TL: ");
        int numberOfOnes = keyboard.nextInt();

        System.out.println("Number of 5TL: ");
        int numberOfFives = keyboard.nextInt();

        System.out.println("Number of 10TL: ");
        int numberOfTens = keyboard.nextInt();

        System.out.println("Number of 20TL: ");
        int numberOfTwenties = keyboard.nextInt();

        // let's declare a variable called totalAmount
        int totalAmount = numberOfOnes + (numberOfFives * 5) +
                (numberOfTens * 10) + (numberOfTwenties * 20);
        System.out.println("Total money: " + totalAmount);
        System.out.println("Total money has " + totalAmount / 20 +
                "x20TLs and " + (totalAmount - ((totalAmount / 20) * 20) + "x1TLs." ));
    }
}
