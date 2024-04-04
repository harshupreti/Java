//To check if student pass or fail
import java.util.Scanner;

public class CWH_4_PS1 {
    public static void main(String[] args) {
        System.out.println("Enter marks of 3 subjects: ");
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        if(marks1 < 33 || marks2 < 33 || marks3 < 33) {
            System.out.println("Fail (Marks in individual subject less than 33%)");
        }
        else {
            if( (marks1 + marks2 + marks3) / 3 < 40) {
                System.out.println("Fail (Total marks less than 40%)");
            }
            else {
                System.out.println("Pass");
            }
        }
        sc.close();
    }
}
