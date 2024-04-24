//nth term of fibonacci series using recursion
import java.util.Scanner;

public class CWH_7_PS5 {
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("Fibonacci of nth term is: "+fibonacci(n));
    }
}
