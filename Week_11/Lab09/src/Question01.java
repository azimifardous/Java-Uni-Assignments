import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        // f(x,y) = 2x + 3y;
        final byte xCoefficient = 2;
        final byte yCoefficient = 3;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Size of the vectors: ");
            byte sizeOfVectors = sc.nextByte();

            if (sizeOfVectors == 0) {
                System.out.println("Bye!");
                break;
            }
            int xInput, yInput, xFinal, yFinal;
            int[] vectors = new int[sizeOfVectors];

            for (int i = 0; i < vectors.length; i++) {
                if (i == 0)
                    System.out.print("First vector (x): ");
                xInput = sc.nextInt();
                xFinal = xInput * xCoefficient;
                vectors[i] = xFinal;
            }

            for (int i = 0; i < vectors.length; i++) {
                if (i == 0)
                    System.out.print("First vector (y): ");
                yInput = sc.nextInt();
                yFinal = yInput * yCoefficient;
                vectors[i] += yFinal;
            }

            System.out.print("Result: [");
            for (int i = 0; i < vectors.length; i++) {
                if (i != vectors.length - 1)
                    System.out.print(vectors[i] + " ");
                else
                    System.out.println(vectors[i] + "]");
            }
        }
    }
}