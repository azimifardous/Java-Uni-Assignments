import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Real Steel Calculator!");

        System.out.println("Enter the value of hardness: ");
        int hardness = sc.nextInt();

        System.out.println("Enter the value of carbon content: ");
        double carbonContent = sc.nextDouble();

        System.out.println("Enter the value of tensile strength: ");
        int tensileStrength = sc.nextInt();

        // first condition hardness must be greater than 50
        // second condition carbon content must be less than 0.7
        // third condition tensile strength must be greater than 5600
        int grade;
        if (hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600) {
            grade = 10;
        } else if (hardness > 50 && carbonContent < 0.7) {
            grade = 9;
        } else if (carbonContent < 0.7 && tensileStrength > 5600) {
            grade = 8;
        } else if (hardness > 50 && tensileStrength > 5600) {
            grade = 7;
        } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
            grade = 6;
        } else {
            grade = 5;
        }

        System.out.println("This is grade " + grade + " steel.");
    }
}