import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
               System.out.print(((j + rows) - i) + " ");
            }
            System.out.println();
        }
    }
}
