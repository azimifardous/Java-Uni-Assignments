import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        int[] arr = setArr();
        boolean isPalindrome = isPalindrome(arr);
        if (isPalindrome)
            System.out.println("This array is a Palindrome.");
        else
            System.out.println("This array is not a Palindrome.");
    }

    public static int[] setArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the capacity of the array: ");
        byte capacity = sc.nextByte();
        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter the element " + (i + 1) + " of the array: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isPalindrome(int[] arr) {
        boolean isPalindrome = false;
        if (arr.length == 0) {
            isPalindrome = true;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr.length == 1)
                    isPalindrome = true;
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[i] != arr[j] && arr.length % 2 != 0)
                        break;
                    isPalindrome = (arr[i] == arr[j]);
                }
            }
        }
        return isPalindrome;
    }

}
