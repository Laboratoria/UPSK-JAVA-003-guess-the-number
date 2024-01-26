import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        System.out.print(name + ", enter your guess: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}