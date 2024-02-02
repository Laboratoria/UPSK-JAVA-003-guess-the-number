import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {

        // Imprimir mensaje en color púrpura
        System.out.print("\u001B[35m" + name + ", enter your guess: " + "\u001B[0m");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }

    // Método para establecer el scanner
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
   }
}