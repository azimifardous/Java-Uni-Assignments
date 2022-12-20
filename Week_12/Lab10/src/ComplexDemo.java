import java.util.Scanner;
public class ComplexDemo {
    private double real;
    private double imag;

    public void init(double re, double img) {
        real = re;
        imag = img;
    }

    public void print() {
        String img = Double.toString(imag);
        if (img.contains("-"))
            System.out.println(real + img + "i");
        else
            System.out.print(real + "+" + img + "i");

    }

    public static void main(String[] args) {
        ComplexDemo b1 = new ComplexDemo();
        System.out.print("Enter a complex number: ");
        Scanner sc = new Scanner(System.in);
        double r, im;
        r = sc.nextDouble();
        im = sc.nextDouble();

        b1.init(r, im);
        b1.print();
    }
}
