//Replace ' ' with '_'
import java.util.Scanner;

public class CWH_3_PS2 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.replace(' ','_');
        System.out.println(str1);
        sc.close();
    }
}
