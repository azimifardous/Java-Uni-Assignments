import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        // using scanner to get the user's input
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(); // declaring variables and assigning it to user's inputs
        double function_01 = ((-2 * Math.pow(x, 2) + (x * y) - 4) / -x); // function of f(x,y)
        double function_02 = (- Math.pow(x, 2) + 5); // function of g(x)
        // Finally printing them out
        System.out.println("Here are the declared and initialized variables: " + "x = " + x + ", " + "y = " + y);
        System.out.println("Here are the output values of the functions: " + "f(" + x + "," + y + ")" + " = " + function_01 + " , g(" + x +")" + " = " + function_02);

    }
}
