//Replace <|name|> in letter with entered name
import java.util.Scanner;

public class CWH_3_PS3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(letter.replace("<|name|>",name));
        sc.close();
    }
}
