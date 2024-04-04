import java.util.*;

public class sumOfThree {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Sum of three numbers is: " + (a+b+c));
        sc.close();
    }
}
