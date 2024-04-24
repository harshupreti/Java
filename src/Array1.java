//To print array in reverse order
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array in reverse is: ");
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i-1]);
        }
    }
}
