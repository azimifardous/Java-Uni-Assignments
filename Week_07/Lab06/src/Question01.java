import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int length; System.out.print("Enter a name: ");
        length = keyboard.next().length();
        switch (length) {
            case 0:
            case 1:
            case 2:
                System.out.println("That is not a real name.");
                break;
            case 3:
            case 4:
                System.out.println("You have a short name.");
                break;
            case 5:
            case 6:
                System.out.println("A name with an average length.");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("What a long name!");
                break;
            default:
                System.out.println("Is this only one name?");
        }
    }
}

