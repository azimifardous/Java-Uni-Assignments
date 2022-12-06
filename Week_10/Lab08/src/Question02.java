import java.util.Arrays;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int smallest = 0;
        int secondSmallest = 0;
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ". number:");
            int a = sc.nextInt();
            numbers[i] = a;
        }

        smallest = numbers[0];
        secondSmallest = numbers[1];
        if (secondSmallest < smallest)
        {
            smallest = numbers[1];
            secondSmallest = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++)
            if (numbers[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = numbers[i];
            }
            else if (numbers[i] < secondSmallest)
            {
                secondSmallest = numbers[i];
            }
        System.out.println("The first smallest number is: " + smallest);
        System.out.println("The second smallest number is: " + secondSmallest);
    }
}
