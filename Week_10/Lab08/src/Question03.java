import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.print("Number's factors are: ");
        int n = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                n++;
                if (i == input)
                    System.out.print(i);
                else
                    System.out.print(i + ", ");

            }
        }
        if (n == 2 || n == 1) {
            System.out.println();
            System.out.println("It's a prime number.");
        }
    }
}
