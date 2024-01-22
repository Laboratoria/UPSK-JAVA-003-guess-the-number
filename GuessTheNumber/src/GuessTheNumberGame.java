import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static int targetNumber;
    private static int lowerNumber = 0;
    private static int higherNumber = 100;

    private static boolean checkGuess(Player player) {

        int guess = player.makeGuess(lowerNumber, higherNumber);
        // cada guess debe ser comparado con targetNumber
        if (guess != targetNumber) {
            // La suposición es incorrecta
            System.out.println(player.getName() + " \033[36mha hecho una suposición: " + "\033[1m" + guess + "\033[0m" +
                    " 👉🏽La suposición fue muy " + (guess > targetNumber ? "\033[35mALTA" : "\033[33mBAJA"));
            // ajusta el rango según la suposición
            if (guess > targetNumber) {
                // Si la suposición es demasiado alta, ajustar el rango superior
                if (guess < higherNumber) {
                    higherNumber = guess;
                }
            } else {
                // Si la suposición es demasiado baja, ajustar el rango inferior
                if (guess > lowerNumber) {
                    lowerNumber = guess;
                }
            }
            return false;
        }

        List<Integer> guesses = player.getGuesses();

        System.out.println("\033[1;32m" + player.getName() + " 🎉 FELICIDADES, HAS GANADO! ");
        System.out.println("El número ganador es " + targetNumber);
        System.out.println("El total de intentos fueron: " + guesses.size());
        System.out.println("Tus suposiciones fueron: " + guesses);

        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;

        List<Player> players = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de jugadores: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players.add(new HumanPlayer(playerName.toUpperCase()));
        }

        players.add(new ComputerPlayer("Computadora"));

        while (true) {
            for (Player player : players) {
                if (checkGuess(player)) {
                    return;  // Salir si alguien gana
                }
            }
        }
    }
}


