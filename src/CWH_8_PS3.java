//TO create a class square and create methods to initialize its side, calculating its area and perimeter
import java.util.Scanner;
class Square {
    int side;
    public void setSide(int s) {
        this.side = s;
    }
    public int getSide() {
        return side;
    }
    public int getArea() {
        return side*side;
    }
    public int getPerimeter() {
        return 4*side;
    }
}
public class CWH_8_PS3 {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println("Enter side of square: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sq.setSide(n);
        System.out.println("Side of square is: "+sq.getSide());
        System.out.println("Area of square is: "+sq.getArea());
        System.out.println("Perimeter of square is: "+sq.getPerimeter());
        sc.close();
    }
}
