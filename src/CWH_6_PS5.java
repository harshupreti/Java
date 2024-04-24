//Reverse an array
import java.util.Scanner;

public class CWH_6_PS5 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //reversing array
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Elements of array after reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
