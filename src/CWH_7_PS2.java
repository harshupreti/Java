//To print half pyramid pattern 
import java.util.Scanner;

public class CWH_7_PS2 {
    
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter no. of rows: ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        pattern(row);
    }
}
