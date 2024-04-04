import java.util.Scanner;

public class CWH_PS4 {
    public static void main(String[] args) {
        System.out.println("Enter the distance in kilometers: ");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        float miles = km/1.609f;
        System.out.println("Distance in miles is: "+miles);
        sc.close();
    }
}