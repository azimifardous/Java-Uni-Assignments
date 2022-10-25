import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args) {
        // making a new Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String str = sc.next();

        System.out.print("Please enter padding number: ");
        int padding = sc.nextInt();
        char[] newArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
             newArr[i] = (char) (newArr[i] + padding);
        }

        System.out.print("Encrypted text is ");
        System.out.println(newArr);


    }
}
