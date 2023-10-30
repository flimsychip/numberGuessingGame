import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(1, 100);
        System.out.print("i'm thinking of a number between 1-99. guess my number: ");
        int guess = in.nextInt();
        while (guess != numberToGuess){
            if (guess > numberToGuess){
                System.out.print("your guess is too high! ");
            } else {
                System.out.print("your guess is too low! ");
            }
            System.out.print("please guess again: ");
            guess = in.nextInt();
        }
        System.out.printf("congrats! the number is %d", numberToGuess);
    }
}