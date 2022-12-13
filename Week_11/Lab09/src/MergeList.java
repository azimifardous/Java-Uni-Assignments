import java.util.Scanner;
public class MergeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first array in ascending order: ");
        int[] firstArr = setArr(sc);

        System.out.println("Enter second array in ascending order: ");
        int[] secondArr = setArr(sc);

        int[] mergedArr = mergeArr(firstArr, secondArr);
        sortArr(mergedArr);

        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }
    public static int[] setArr(Scanner sc) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
            count++;
        }

        for (int i : arr2) {
            mergedArr[count++] = i;
        }
        return mergedArr;
    }
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
