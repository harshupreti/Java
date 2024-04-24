//Factorial of a number using while loop
import java.util.Scanner;

public class CWH_5_PS6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
