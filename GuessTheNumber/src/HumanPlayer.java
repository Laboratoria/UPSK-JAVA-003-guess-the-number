import java.util.Scanner;

public class HumanPlayer extends Player {

    private final Scanner scanner = new Scanner(System.in);

    protected HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.println("\u001B[44m\u001B[30m" + getName() + " ingresa el número ganador aquí: \u001B[0m");
        //Generar
        int myGuess = scanner.nextInt();
        //Guardar
        this.guesses.add(myGuess);
        //Retornar
        return myGuess;
    }
}