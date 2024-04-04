import java.util.Scanner;

public class CWH_2_PS1 {
    public static void main(String[] args) {
        System.out.println("Enter grade: ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        grade = (char)(grade+8);
        System.out.println("Encrypted grade is: "+ grade);
        grade = (char)(grade-8);
        System.out.println("Decrypted grade is: "+grade);
        sc.close();
    }
}
