import java.util.Scanner;
import java.util.List;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int makeGuess() {
        int guess = 0;
        boolean inputValid = false;

        do {
            try {
                System.out.print(name + " Por favor ingrese su número entre 1 y 100: ");
                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Por favor, ingrese un número válido entre 1 y 100.");
                } else {
                    inputValid = true;
                }
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine(); // Limpiar el buffer para evitar un bucle infinito
            }
        } while (!inputValid);

        guesses.add(guess);
        return guess;
    }

}
