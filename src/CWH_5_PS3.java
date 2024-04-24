//To print multiplication table of a given number
import java.util.Scanner;

public class CWH_5_PS3 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int product = n*(i+1);
            System.out.println(n+" X "+(i+1)+": "+product);
        }
    }
}
