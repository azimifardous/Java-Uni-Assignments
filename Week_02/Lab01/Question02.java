import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        // using scanner to get the user's input
        Scanner sc = new Scanner(System.in);
        // declaring variables and assigning the values
        double radius = sc.nextDouble(), height = sc.nextDouble(), pi = 3.14, volume;
        // Cylinder Formula; Using Math.pow(x,y) method to get the square of radius
        volume = (pi * Math.pow(radius, 2) * height);
        System.out.println("If the radius is " + radius + " and the height is " + height + " then ");
        System.out.println("The volume of the cylinder is " + volume);


    }
}
