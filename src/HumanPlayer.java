import java.util.Scanner;
import java.util.List;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }
    @Override
    public int makeGuess() {
        int guess;
        do {
            System.out.print( name + " Por favor ingrese su numero entre 1 y 100: ");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.print("Por favor, ingrese un número válido entre 1 y 100.");
            }else {
                scanner.next();
                System.out.print("Por favor, ingrese un número válido entre 1 y 100.");
            }
        } while (guess < 1 || guess > 100);


        guesses.add(guess);
        return guess;
    }
    public List<Integer> getGuessHistory() {
        return guesses;
    }
    public void setName(String playerName) {
        this.name = playerName;
    }

}
