//Find whether a given integer is in array or not
import java.util.Scanner;

public class CWH_6_PS2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer to find in array: ");
        int num = sc.nextInt();

        int flag = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == num) {
                System.out.println("Element found!");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found!");
        }

    }
}
