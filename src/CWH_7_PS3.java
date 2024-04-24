//Recursive funtion to calculate sum of first n natural numbers
import java.util.Scanner;

public class CWH_7_PS3 {
    
    static int sum(int n, int s) {
        
        if (n == 0) {
            return s;
        }
        else {
            s += n;
            return sum(n-1,s);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 0;
        System.out.println("Sum of first natural numbers is: "+sum(n,s));
    }
}
