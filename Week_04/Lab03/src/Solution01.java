import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args) {
      // Making a Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String str = sc.nextLine();

        // Finding the last two characters of the string
        int indexOfLastChar = str.length() - 1;
        int indexOfLast2Char = str.length() - 2;
        System.out.println("Last two characters in your entry is: "
                + str.charAt(indexOfLast2Char) + str.charAt(indexOfLastChar));

        // Length of the string
        System.out.println("Your entry has: " + str.length() + " characters");

        // Transforming to uppercase
        System.out.println("The UPPERCASE value of the string you entered is: " + str.toUpperCase());

        // To lowercase
        System.out.println("The lowercase value of the string you entered is: " + str.toLowerCase());

        // are they equal? true/false
        System.out.println("Are they equal? " + str.toUpperCase().equalsIgnoreCase(str.toLowerCase()));

        // occurrence of character "a" in string
        System.out.println("Index of character 'a' in your entry is: " + str.indexOf("a"));

        // concatenating the string with a new string
        String newStr = str + "-cmpe113-";
        System.out.println("The strings are concatenated: " + newStr);

        // length of the new string
        System.out.println("It's length becomes: " + newStr.length());

        // the substring which is composed of: first white space, the character before white
        // space and the character after white space.
        int firstWhiteSpace = str.indexOf(" ");
        System.out.println(str.charAt(firstWhiteSpace - 1)
                + str.substring(firstWhiteSpace, firstWhiteSpace + 1) + str.charAt(firstWhiteSpace + 1));


    }
}