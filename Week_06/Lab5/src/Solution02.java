import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to days in a month calculator...");
        System.out.println("Enter a month:");
        String month = sc.next();

        int days;
        // checking for valid entry month
        if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("feb")
        || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("apr")
        || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("jun")
        || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("aug")
        || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("oct")
        || month.equalsIgnoreCase("nov") || month.equalsIgnoreCase("dec")) {
            if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar")
                    ||  month.equalsIgnoreCase("may") || month.equalsIgnoreCase("july")
                    || month.equalsIgnoreCase("aug") || month.equalsIgnoreCase("oct")
                    || month.equalsIgnoreCase("dec")) {
                    days = 31;
                    System.out.println("There are " + days + " days in " + month + ".");
            } else if (month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun")
                    || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("nov")) {
                    days = 30;
                    System.out.println("There are " + days + " days in " + month + ".");
            } else {
                days = 29;
                System.out.println("There are " + days + " days in Feb if leap year, otherwise 28.");
            }
        } else {
            System.out.println("The month in invalid.");
        }
    }
}


