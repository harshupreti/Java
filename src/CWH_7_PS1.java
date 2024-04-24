//Java method to print multiplication table of a number
import java.util.Scanner;

public class CWH_7_PS1 {
    static void multTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n+" X "+i+": "+product);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        multTable(n);
    }
}
