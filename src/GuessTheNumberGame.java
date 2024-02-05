import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    //Secuencias ANSI para los colores
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static Random random = new Random();
    private static int targetNumber;
    private static boolean gameWon = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mensaje de bienvenida
        System.out.println("\u001B[1;32m");
        System.out.println("*********************************************");
        System.out.println("*                  ¡Welcome to the          *");
        System.out.println("*              Guess the Number Game!       *");
        System.out.println("*********************************************");
        System.out.println("\u001B[0m");
        //Instrucciones del juego
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "The game consists of guessing a number from 1 to 100, and beating the ComputerPlayer 🎮" + ANSI_RESET);
        //solicitar al jugador humano que ingrese el nombre
        System.out.print(ANSI_PURPLE + "Human, enter your name: ");
        String humanName = scanner.nextLine();

        //crear jugador humano con el nombre dado
        HumanPlayer humanPlayer = new HumanPlayer(humanName);

        initializeGame();
        playGame(humanPlayer);
        scanner.close();
    }

    private static void initializeGame() {
        targetNumber = random.nextInt(100) + 1;
    }

    private static void playGame(HumanPlayer humanPlayer) {
        Scanner scanner = new Scanner(System.in);


        // Crear jugador computadora
         ComputerPlayer computerPlayer = new ComputerPlayer("Computer");




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