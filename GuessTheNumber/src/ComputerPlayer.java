import java.util.Random;

public class ComputerPlayer extends Player {
    private final Random random;
    public ComputerPlayer(String name){
        super(name);
        random = new Random();
    }
    @Override
    public int makeGuess() {
        //Genera el numero
        int myGuess = random.nextInt(100) + 1;
        //Guarda el numero
        this.guesses.add(myGuess);
        //Retorna el numero
        return myGuess;
    }
}