import java.util.List;
import java.util.Random;

public class GuessTheNumberGame {
    private static Random random;
    private static int targetNumber;

    private static boolean checkGuess(Player player) {
        int guess = player.makeGuess();


        if (guess != targetNumber) {
            System.out.println(player.getName() + " ha hecho una suposición: " + guess + " 👉🏽La suposición fue muy " + (guess > targetNumber ? "alta" : "baja"));

            return false;
        }
        List<Integer> guesses =  player.getGuesses();

        System.out.println(player.getName() + " 🎉 FELICIDADES, HAS GANADO! " + "El total de intentos: " + guesses.size());

        // Mostrar suposiciones de cada jugador
        System.out.println(player.getName() + " tus suposiciones fueron: " + guesses);

        return true;
    }

    public static void main(String[] args) {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;

        ComputerPlayer computer = new ComputerPlayer("💻Computadora");
        HumanPlayer human = new HumanPlayer("👧🏽Yenny");

        while (!checkGuess(computer) && !checkGuess(human)) {
            //repetir
        }
    }
}
