import java.util.*;

public class CardGame {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    static String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Card Game developed by Monty");
        System.out.println("Enter number of rounds:");

        int rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i);

            int playerCard = rand.nextInt(13);
            int computerCard = rand.nextInt(13);

            System.out.println("Player draws: " + cards[playerCard]);
            System.out.println("Computer draws: " + cards[computerCard]);

            if (playerCard > computerCard) {
                System.out.println("Player wins this round");
                playerScore++;
            } else if (computerCard > playerCard) {
                System.out.println("Computer wins this round");
                computerScore++;
            } else {
                System.out.println("It's a tie");
            }

            System.out.println("Score -> Player: " + playerScore + " Computer: " + computerScore);
        }

        System.out.println("\nFinal Result");

        if (playerScore > computerScore) {
            System.out.println("Player wins the game!");
        } else if (computerScore > playerScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("Game Draw!");
        }
    }
}
