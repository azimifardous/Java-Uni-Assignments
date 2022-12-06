import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("1. number:");
       int a = sc.nextInt();
       int smallestNumber = 0;
       int tmp = 0;
       for (int i = 2; i <= 10; i++) {
           if (i == 2) tmp = a;
           System.out.println(i + ". number:");
           a = sc.nextInt();
           smallestNumber = Math.min(a, tmp);
           tmp = Math.min(smallestNumber, a);
       }
        System.out.println("The smallest number is: " + smallestNumber);
    }
}