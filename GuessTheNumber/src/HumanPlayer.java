import java.util.Scanner;

public class HumanPlayer extends Player {

    private final Scanner scanner = new Scanner(System.in);

    protected HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.println(getName() + " ingresa el número ganador aquí: ");
        //Generar
        int myGuess = scanner.nextInt();
        //Guardar
        this.guesses.add(myGuess);
        //Retornar
        return myGuess;
    }
}