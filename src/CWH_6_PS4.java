//To add two 2X3 matrix
import java.util.Scanner; 

public class CWH_6_PS4 {
    
    static void getElements (int[][] arr, int x, int y) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        System.out.println("Enter elements of array 1");
        getElements(arr1,2,3);
        System.out.println("Enter elements of array 2");
        getElements(arr2,2,3);

        int[][] arr3 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of the two matrices is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
