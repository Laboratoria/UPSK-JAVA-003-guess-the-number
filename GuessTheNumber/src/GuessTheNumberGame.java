import java.util.Random;

public class GuessTheNumberGame {
    private static java.util.Random random;
    private static int targetNumber;

    private static boolean checkGuess(Player player) {
        return player.makeGuess() == targetNumber;
    }

    public static void main(String[] args) {
        random = new Random();
        ComputerPlayer computer = new ComputerPlayer("Computador");
        HumanPlayer human = new HumanPlayer("Yenny");
        targetNumber = random.nextInt(0, 100);



        if (checkGuess(computer)){
            System.out.println(computer.getName()  + " ha ganado!!");
        }

    }
}