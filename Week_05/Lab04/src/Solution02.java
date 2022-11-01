import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args) {
        /* Write a java program to check if a number is divisible by other.
            A x is divisible by y, if there is no remainder left in the division operation. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int num_01 = sc.nextInt();
        int num_02 = sc.nextInt();

        if (num_01 % num_02 == 0) {
            System.out.println(num_01 + " is divisible by " + num_02);
        } else {
            System.out.println(num_01 + " is not divisible by " + num_02);
        }
    }
}
