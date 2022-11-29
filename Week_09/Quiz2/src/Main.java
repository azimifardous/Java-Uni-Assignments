import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        int counter = 0;
        int vowels = 0;
        while (!(name.equals("-1"))) {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a' || name.charAt(i) == 'A' || name.charAt(i) == 'e'
                        || name.charAt(i) == 'E' || name.charAt(i) == 'i' || name.charAt(i) == 'I' ||
                        name.charAt(i) == 'o' || name.charAt(i) == 'O' || name.charAt(i) == 'u' || name.charAt(i) == 'U') {
                    vowels++;
                }
            }
            System.out.println("The name contains " + vowels + " vowels.");
            System.out.println("Enter a name:");
            name = sc.nextLine();
            counter++;
            vowels = 0;
        }
        System.out.println("Overall " + counter + " people were considered.");
    }
}