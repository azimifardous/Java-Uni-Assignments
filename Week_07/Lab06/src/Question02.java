import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println("Square of " + i + ": " + (i * i));
            i++;
        }
    }
}
