import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 44;
        System.out.println("I have picked a number between 1 and 100.");
        int guessedNumber;
        int guessedTimes = 0;
        do {
            System.out.print("Guess the number: ");
            guessedNumber = sc.nextInt();
            guessedTimes++;
            if (guessedNumber > number) {
                System.out.println("Decrease your guess");
            } else if (guessedNumber < number) {
                System.out.println("Increase your guess");
            } else {
                System.out.print("You have found the number after " + guessedTimes + " guess.");
            }
        } while (guessedNumber != number);
    }
}
