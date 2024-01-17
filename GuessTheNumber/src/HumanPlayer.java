import java.util.Scanner;

public class HumanPlayer extends Player {

    protected HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.println(getName() + " ingresa el número ganador aquí: ");
        //Generar
        Scanner scanner = new Scanner(System.in);
        int myGuess = scanner.nextInt();
        //Guardar
        this.guesses.add(myGuess);
        //Retornar
        return myGuess;
    }
}