//To check for double and triple spaces
import java.util.Scanner;

public class CWH_3_PS4 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.indexOf("  ")); //Returns -1 if no double space else index
        System.out.println(str.indexOf("   ")); //Returns -1 if no triple space else index
        sc.close();  
    }
}
