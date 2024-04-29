//To create a class Rectangle with methods to initialize length and breadth,
//calculate area and perimeter
import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    public void setDimensions(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
    public void getDimensions() {
        System.out.println("Length is: "+length+" Breadth is: "+breadth);
    }
    public int getArea() {
        return length*breadth;
    }
    public int getPerimeter() {
        return 2*(length+breadth);
    }
}

public class CWH_8_PS4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Enter length and breadth: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        rect.setDimensions(l, b);
        rect.getDimensions();
        System.out.println("Area of rectangle is: "+rect.getArea());
        System.out.println("Perimeter of rectangle is: "+rect.getPerimeter());
    }
}
