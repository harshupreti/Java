//Create an array of 5 floats and caluclate their sum
import java.util.Scanner;
public class CWH_6_PS1 {
    public static void main(String[] args) {
        float[] arr = new float[5];
        System.out.println("Enter elements of array(5): ");
        Scanner sc = new Scanner(System.in);

        float sum = 0.0f;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of elements is: "+sum);
        
    }
}
