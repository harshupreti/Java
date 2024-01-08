import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter radius: ");

        double radius = obj.nextDouble();
        
        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle is: " + area);
    }
}
