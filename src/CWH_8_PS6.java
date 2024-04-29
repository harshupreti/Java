//TO create a class circle with methods to initialize radius and 
//calcualte area and perimeter
import java.util.Scanner;

class Circle {
    int radius;

    public void setRadius(int r) {
        this.radius = r;
    }
    public int getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
public class CWH_8_PS6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        c1.setRadius(r);
        System.out.println("Radius of circle is: "+c1.getRadius());
        System.out.println("Area of circle is: "+c1.getArea());
        System.out.println("Perimeter of circle is: "+c1.getPerimeter());
    }
}
