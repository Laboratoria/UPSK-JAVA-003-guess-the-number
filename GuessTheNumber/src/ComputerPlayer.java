import java.util.Random;

public class ComputerPlayer extends Player {
    private final java.util.Random random;

    public ComputerPlayer(String name){
        super(name);
        random = new Random();
    }

    @Override
    public int makeGuess() {
        return random.nextInt(0, 100);
    }
}