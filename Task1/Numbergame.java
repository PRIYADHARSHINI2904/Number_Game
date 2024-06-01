package Task1;
import java.util.Random;
import java.util.Scanner;
public class Numbergame {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int minRange =1;            //Minimum range for the random number
        int maxRange=100;           //Maximum range for the random number
        int maxAttempts=5;          //Maximum number of attempts per round
        int score=0;                //Initialize score
        System.out.println("Welcome to the Number Guessing Game..");
        System.out.println("Guess the Number!");
        boolean playAgain = true;
        while(playAgain) {
            int randomNumber=random.nextInt(maxRange -minRange+1)+minRange;
            int attempts=0;
            System.out.println("\nI'm thinking of a number between "+ minRange+" and "+ maxRange+".");
            System.out.println("You have "+ maxAttempts+ " attempts to guess it.");
            for (int i = 1; i <= maxAttempts; i++) {
                System.out.print("Enter your "+ i +" guess: ");
                int userGuess=scanner.nextInt();
                attempts++;
                if(userGuess==randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts) + 1; // Update the score
                    break;
                }
                else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("Too high! Try again.");
                }
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
                }
            }
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes") || playChoice.equals("y");
        }
        System.out.println("\nYour total score is: " + score);
        System.out.println("Thank you for playing Guess the Number!");
        scanner.close();

    }

}
