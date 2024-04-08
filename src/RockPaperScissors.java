import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int computer = rand.nextInt(3);

        System.out.println("Choose rock, paper or scissor: ");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissor");

        Scanner sc = new Scanner(System.in);
        int player_choice = sc.nextInt();

        if(computer==0){
            System.out.println("Computer has picked rock.");
        }
        else if(computer==1){
            System.out.println("Computer has picked paper.");
        }
        else {
            System.out.println("Computer has picked scissor.");
        }

        switch (player_choice) {
            case 0:
                if (computer == 1)
                {
                    System.out.println("Computer wins!");
                }
                else if (computer == 2) 
                {
                    System.out.println("Player wins!");
                }
                else 
                {
                    System.out.println("Draw!");
                }
                break;

            case 1:
                if (computer == 1)
                {
                    System.out.println("Draw!");
                }
                else if (computer == 2) 
                {
                    System.out.println("Computer wins!");
                }
                else 
                {
                    System.out.println("Player wins!");
                }
                break;
            case 2:
                if (computer == 1)
                {
                    System.out.println("Player wins!");
                }
                else if (computer == 2) 
                {
                    System.out.println("Draw!");
                }
                else 
                {
                    System.out.println("Computer wins!");
                }
                break;        
            default:
                System.out.println("Choose one of the choices mentioned above.");
                break;
        }

    sc.close();
    }
}
