import java.util.*;

public class temperature {
    public static void main(String[] args)
    {
        System.out.print("Enter the value in fahrenheit: ");

        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.print("Temperature in celsius is: " + celsius);
        input.close();
    }
}
