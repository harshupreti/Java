//To create a guess the number game
import java.util.Scanner;
import java.util.Random;
class Game {
    int generated_number;
    int input_number;
    int no_of_guesses;
    public Game() {
        System.out.println("Welcome to Guess The Number");
        System.out.println("Try to guess the number between 0 to 100");
        Random r = new Random();
        this.generated_number = r.nextInt(100);
        no_of_guesses = 0;
    }
    
    public void takeUserInput(int i) {
        input_number = i;
    }

    public boolean isCorrectNumber() {
        if(input_number == generated_number) {
            return true;
        }
        else {
            if(input_number > generated_number) {
                System.out.println(input_number+" is greater than the number");
            }
            else {
                System.out.println(input_number+" is smaller than the number");
            }
            return false;
        }
    }

    public void set() {
        this.no_of_guesses++;
    }

    public int get() {
        return no_of_guesses;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        do {
            System.out.println("Enter your number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            g.takeUserInput(n);
            g.set();
        } while(! g.isCorrectNumber());

        System.out.println();
        System.out.println("Your guess is correct");
        System.out.println();
        System.out.println("Your score is: " + g.get());
    }
}
