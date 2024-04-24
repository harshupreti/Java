//To sum first n even numbers using while
import java.util.Scanner;

public class CWH_5_PS2 {
    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int  i = 1;
        while (i <= n) {
            sum += 2*i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}
