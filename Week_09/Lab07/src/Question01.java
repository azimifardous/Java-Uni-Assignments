import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the class size: ");
        int classSize = sc.nextInt();
        double grade, sum = 0, average = 0;
        int failedStudents = 0;
        if (classSize == 0) { // if size is zero there should be at least one student
            System.out.print("Enter the grade between 0 and 100 for student 1: " );
            grade = sc.nextDouble();
            while (!(grade >= 0 && grade <= 100)) { // check till the entered grade is within range
                System.out.print("Grade is out of range, please enter again: ");
                grade = sc.nextDouble();
            }
            average = grade;
            System.out.println("Average of the grades is: " + average);
            if (grade < 55) failedStudents = 1;
            System.out.println("Number of failed students are: " + failedStudents);
        } else {
            for (int i = 1; i <= classSize; i++) {
                System.out.print("Enter the grade between 0 and 100 for student " + i + ": " );
                grade = sc.nextDouble();
                while (!(grade >= 0 && grade <= 100)) {
                    System.out.print("Grade is out of range, please enter again: ");
                    grade = sc.nextDouble();
                }
                // quick check for how many students failed
                if (grade < 55) failedStudents++;
                sum += grade;
                average = sum / classSize;
            }
            System.out.println("Average of the grades is: " + average);
            System.out.println("Number of failed students are: " + failedStudents);
        }
    }
}