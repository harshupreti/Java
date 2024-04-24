//Calculating average marks from an array containing marks of all students in Physics
//using for each loop.
import java.util.Scanner;

public class CWH_6_PS3 {
    public static void main(String[] args) {
        System.out.println("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks in Physics: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int element: marks) {
            sum += element;
        }
        float average = (float) sum/n;
        System.out.println("Average is: "+average);
    }
}
