import java.util.Random;

public class GuessTheNumberGame {
    private static Random random;
    private static int targetNumber;

    private static boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess != targetNumber) {
            System.out.println(player.getName() + " ha hecho una suposición: " + guess);
            System.out.println(player.getName() + " La suposición fue muy " + (guess > targetNumber ? "alta" : "baja"));

            return false;
        }
        System.out.println(player.getName() + " ha ganado!");
        return true;
    }

    public static void main(String[] args) {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;

        ComputerPlayer computer = new ComputerPlayer("Computadora");
        HumanPlayer human = new HumanPlayer("Yenny");

        while (!checkGuess(computer) && !checkGuess(human)) {
            //repetir
        }
    }
}
