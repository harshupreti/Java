import java.util.*;

public class CWH_PS2 {
    public static void main(String[] args) {
        System.out.println("Enter marks of 3 subjects (out of 100): ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float cgpa = (num1+num2+num3)/30.0f;
        System.out.println("CGPA is: "+cgpa);
        sc.close();
    }
}
