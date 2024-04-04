import java.util.*;

public class computeAvg {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 variables: ");

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        double average = (first+second+third) / 3.0;

        System.out.print("Average is: " + average);
        input.close();
    }

}
