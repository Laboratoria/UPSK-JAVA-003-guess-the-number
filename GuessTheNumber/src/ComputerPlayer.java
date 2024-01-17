import java.util.Random;

public class ComputerPlayer extends Player {
    private final Random random;
    public ComputerPlayer(String name){
        super(name);
        random = new Random();
    }
    @Override
    public int makeGuess() {
        //Generar
        int myGuess = random.nextInt(100) + 1;
        //Guardar
        this.guesses.add(myGuess);
        //Retornar
        return myGuess;
    }
}