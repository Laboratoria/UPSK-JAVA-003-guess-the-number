import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    // Secuencias ANSI para los colores
    private static final String ANSI_RESET = "\u001B[0m"; // Restablece el color de la consola
    private static final String ANSI_PURPLE = "\u001B[35m"; // Color morado para mensajes
    private static final String ANSI_CYAN = "\u001B[36m"; // Color cian para mensajes
    private static final String ANSI_YELLOW = "\u001B[33m"; // Color amarillo para mensajes
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m"; // Fondo blanco
    private static final String ANSI_BLACK = "\u001B[30m"; // Color negro para mensajes
    private static Random random = new Random(); // Generador de números aleatorios
    private static int targetNumber; // Número objetivo a adivinar
    private static boolean gameWon = false; // Estado del juego

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // Mensaje de bienvenida
        System.out.println("\u001B[1;32m"); // Cambia el color de la consola a verde claro
        System.out.println("*********************************************");
        System.out.println("*                  ¡Welcome to the          *");
        System.out.println("*              Guess the Number Game!       *");
        System.out.println("*********************************************");
        System.out.println("\u001B[0m"); // Restablece el color de la consola

        // Instrucciones del juego
        System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "The game consists of guessing a number from 1 to 100, and beating the ComputerPlayer 🎮" + ANSI_RESET);

        // Solicitar al jugador humano que ingrese el nombre
        System.out.print(ANSI_PURPLE + "Human, enter your name: "); // Imprime mensaje en color morado
        String humanName = scanner.nextLine(); // Lee el nombre del jugador humano

        // Crear jugador humano con el nombre dado
        HumanPlayer humanPlayer = new HumanPlayer(humanName);

        initializeGame(); // Inicializa el juego generando el número objetivo

        // Iniciar el juego
        playGame(humanPlayer); // Comienza el juego con el jugador humano

        scanner.close(); // Cierra el scanner
    }

    private static void initializeGame() {
        targetNumber = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100 como el número objetivo
    }

    private static void playGame(HumanPlayer humanPlayer) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // Crear jugador de computadora
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Iniciar turnos alternados
        while (!gameWon) {
            // Turno del jugador humano
            int humanGuess = humanPlayer.makeGuess(); // El jugador humano hace una suposición
            checkGuess(humanPlayer, humanGuess); // Verifica la suposición del jugador humano

            // Verificar si el jugador humano ganó
            if (humanGuess == targetNumber) {
                gameWon = true; // Establece el estado del juego como ganado
                System.out.println(ANSI_YELLOW + "Congratulations! " + humanPlayer.getName() + " wins!" + ANSI_RESET); // Imprime mensaje de felicitaciones
                break; // Sale del bucle
            }

            // Imprimir mensaje para el jugador de la computadora en color cian
            System.out.print(ANSI_CYAN + "Computer, enter your guess: " + ANSI_RESET); // Imprime mensaje en color cian

            // Turno del jugador de la computadora
            int computerGuess = computerPlayer.makeGuess(); // El jugador de la computadora hace una suposición
            checkGuess(computerPlayer, computerGuess); // Verifica la suposición del jugador de la computadora

            // Verificar si la computadora ganó
            if (computerGuess == targetNumber) {
                gameWon = true; // Establece el estado del juego como ganado
                System.out.println(ANSI_YELLOW + "Computer wins! The correct number was: " + targetNumber + ANSI_RESET); // Imprime mensaje de que la computadora ganó
                break; // Sale del bucle
            }
        }

        // Mostrar historial de suposiciones al final del juego
        System.out.println(ANSI_PURPLE + "Human's guesses: " + humanPlayer.getGuesses() + ANSI_RESET); // Imprime el historial de suposiciones del jugador humano
        System.out.println(ANSI_CYAN + "Computer's guesses: " + computerPlayer.getGuesses() + ANSI_RESET); // Imprime el historial de suposiciones del jugador de la computadora

        scanner.close(); // Cierra el scanner
    }

    private static void checkGuess(Player player, int guess) {
        if (guess < targetNumber) {
            System.out.println(player.getName() + " guessed too low."); // Imprime mensaje si la suposición es demasiado baja
        } else if (guess > targetNumber) {
            System.out.println(player.getName() + " guessed too high."); // Imprime mensaje si la suposición es demasiado alta
        } else {
            System.out.println(player.getName() + " guessed correctly!"); // Imprime mensaje si la suposición es correcta
            gameWon = true; // Establece el estado del juego como ganado
        }
    }
}