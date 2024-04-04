//Convert a string to lowercase
import java.util.*;

public class CWH_3_PS1 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        System.out.println(str1);
        sc.close();
    }
}
