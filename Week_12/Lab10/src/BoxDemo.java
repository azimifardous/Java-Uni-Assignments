import java.util.Scanner;

public class BoxDemo {
    private int width;
    private int length;
    private int height;

    public void init(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public void print() {
        int volume = width * length * height;
        System.out.println("The volume of box: " + volume);

        if (width == height && height == length)
            System.out.println("It's a Cube");
        else
            System.out.println("It's a Cuboid");
    }

    public static void main(String[] args) {
        BoxDemo b1 = new BoxDemo();
        System.out.print("Enter box dimensions: ");
        Scanner sc = new Scanner(System.in);
        int w, h, l;
        w = sc.nextInt();
        h = sc.nextInt();
        l = sc.nextInt();

        b1.init(w, h, l);
        b1.print();
    }

}
