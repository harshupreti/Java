//Factorial of given number using for loop
import java.util.Scanner;

public class CWH_5_PS5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

    }
}
