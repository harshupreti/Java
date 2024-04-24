//To check whether an array is sorted or not
import java.util.Scanner;

public class CWH_6_PS8 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //checking for sort
        int flag = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                flag = 1;
                System.out.println("Not sorted!");
                break;
            }
        }

        if(flag == 0) {
            System.out.println("Sorted!");
        }
    }
}
