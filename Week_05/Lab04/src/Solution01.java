import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args) {
        /* Write a java program to decide larger of two input numbers.
        It takes two numbers as input, and prints the larger one.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int num_01 = sc.nextInt();
        int num_02 = sc.nextInt();

        if (num_01 > num_02)
            System.out.println("The large number is: " + num_01);
        else
            System.out.println("The large number is: " + num_02);
    }
}