import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    //Secuencias ANSI para los colores
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_YELLOW = "\u001B[33m";
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
        //Mensaje de bienvenida
        System.out.println("\033[1;35m");
        System.out.println("*********************************************");
        System.out.println("*                  ¡Welcome to the          *");
        System.out.println("*              Guess the Number Game!       *");
        System.out.println("*********************************************");
        System.out.println("\033[0m");

        // Iniciar turnos alternados
        while (!gameWon) {

            // Turno del jugador humano
            int humanGuess = humanPlayer.makeGuess();
            checkGuess(humanPlayer, humanGuess);


            // Verificar si el jugador humano ganó
            if (humanGuess == targetNumber) {
                gameWon = true;
                System.out.println(ANSI_YELLOW + "Congratulations! " + humanPlayer.getName() + " wins!" + ANSI_RESET);
                break;
            }
            // Imprimir mensaje para el jugador de la computadora en color cian
            System.out.print(ANSI_CYAN + "Computer, enter your guess: " + ANSI_RESET);

            // Turno del jugador de la computadora
            int computerGuess = computerPlayer.makeGuess();
            checkGuess(computerPlayer, computerGuess);

            // Verificar si la computadora ganó
            if (computerGuess == targetNumber) {
                gameWon = true;
                System.out.println(ANSI_YELLOW + "Computer wins! The correct number was: " + targetNumber + ANSI_RESET);
            }
        }

        // Mostrar historial de suposiciones al final del juego
        System.out.println(ANSI_PURPLE + "Human's guesses: " + humanPlayer.getGuesses() + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Computer's guesses: " + computerPlayer.getGuesses() + ANSI_RESET);

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