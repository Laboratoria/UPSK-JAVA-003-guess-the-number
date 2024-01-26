import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;
    private static boolean gameWon = false;

    public static void main(String[] args) {
        initializeGame();
        playGame();
    }

    private static void initializeGame() {
        targetNumber = random.nextInt(100) + 1;
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);

        // Crear jugadores
        HumanPlayer humanPlayer = new HumanPlayer("Human");
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Iniciar turnos alternados
        while (!gameWon) {
            // Turno del jugador humano
            int humanGuess = humanPlayer.makeGuess();
            checkGuess(humanPlayer, humanGuess);

            // Verificar si el jugador humano ganó
            if (humanGuess == targetNumber) {
                gameWon = true;
                System.out.println("Congratulations! " + humanPlayer.getName() + " wins!");
                break;
            }

            // Turno del jugador de la computadora
            int computerGuess = computerPlayer.makeGuess();
            checkGuess(computerPlayer, computerGuess);

            // Verificar si la computadora ganó
            if (computerGuess == targetNumber) {
                gameWon = true;
                System.out.println("Computer wins! The correct number was: " + targetNumber);
            }
        }

        // Mostrar historial de suposiciones al final del juego
        System.out.println("Human's guesses: " + humanPlayer.getGuesses());
        System.out.println("Computer's guesses: " + computerPlayer.getGuesses());

        scanner.close();
    }

    private static void checkGuess(Player player, int guess) {
        if (guess < targetNumber) {
            System.out.println(player.getName() + " guessed too low.");
        } else if (guess > targetNumber) {
            System.out.println(player.getName() + " guessed too high.");
        } else {
            System.out.println(player.getName() + " guessed correctly!");
            gameWon = true;
        }
    }
}