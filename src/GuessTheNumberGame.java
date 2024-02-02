import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private Random random;
    private int targetNumber;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;
    private boolean gameOver;

    public GuessTheNumberGame() {
        random = new Random();
        targetNumber = random.nextInt(101);
        gameOver = true;
    }

    public static void main (String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame();
    }
    public void playGame() {

        Scanner scanner = new Scanner(System.in);
        String name;
        humanPlayer = new HumanPlayer("");
        //computerPlayer = new ComputerPlayer("Computadora");

        do {
            System.out.print("Por favor ingrese su nombre: ");
            name = scanner.next();
            humanPlayer.setName(name);
            computerPlayer = new ComputerPlayer("Jugador 2");
        } while (name.isEmpty());

        System.out.println(targetNumber);

        System.out.println("Bienvenid@ al juego " + name + "!");
        System.out.println();


        while (gameOver) {
            checkGuess(humanPlayer);
            if (!gameOver) {
                break;
            }
            checkGuess(computerPlayer);
        }
        List<Integer> historialHumanPlayer = humanPlayer.getGuessHistory();
        System.out.println("Historial de intentos de " + name + " es:" + historialHumanPlayer);

        List<Integer> historialComputerPlayer = computerPlayer.getGuessHistory();
        System.out.println("Historial de intentos del jugador2: " + historialComputerPlayer);

        scanner.close();
    }
    public void checkGuess(Player player) {
        int playerGuess = player.makeGuess();
        System.out.println(  player.getName() +  " Ha ingresado el número: " + playerGuess);

        if (playerGuess <= 0 || playerGuess > 100) {
            System.out.println("El numero ingresado debe estar entre 1 y 100. Intenta de nuevo.");
            return;
        }

        if (playerGuess < targetNumber) {
            System.out.println("Lo siento, el numero ingresado es menor al número a adivinar. Intenta de nuevo.");
        } else if (playerGuess > targetNumber) {
            System.out.println("Lo siento, el numero ingresado es mayor al número a adivinar. Intenta de nuevo.");
        } else {
            System.out.println("\u001B[32m¡Felicidades, has adivinado el número " + targetNumber + "! Has ganado, " + player.getName() + "!\u001B[0m" + "");
            gameOver = false;
        }
        System.out.println();

    }
    public HumanPlayer getHumanPlayer() {
        return humanPlayer;
    }
    public boolean isGameOver() {
        return gameOver;
    }


}


