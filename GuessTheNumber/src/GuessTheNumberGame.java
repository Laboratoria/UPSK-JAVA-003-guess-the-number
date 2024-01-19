import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static int targetNumber;

    private static boolean checkGuess(Player player) {
        int guess = player.makeGuess();

        if (guess != targetNumber) {
            System.out.println(player.getName() + " \033[36mha hecho una suposición: " + guess + " 👉🏽La suposición fue muy " + (guess > targetNumber ? "\033[35malta" : "\033[33mbaja"));
            return false;
        }

        List<Integer> guesses = player.getGuesses();
        System.out.println(player.getName() + " 🎉 \033[32mFELICIDADES, HAS GANADO! " + "El total de intentos: " + guesses.size() +  " y tus suposiciones fueron: " + guesses);

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


