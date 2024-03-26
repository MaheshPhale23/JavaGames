package Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: rock, paper, or scissors");

        String playerChoice = scanner.nextLine().toLowerCase();
        int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
        
//        System.out.println(computerChoice);

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Computer chooses: " + choices[computerChoice]);
        
        

        // Determine the winner
        if (playerChoice.equals(choices[computerChoice])) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice == 2) ||
                   (playerChoice.equals("paper") && computerChoice == 0) ||
                   (playerChoice.equals("scissors") && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
		
	}
}
