import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(101);
        guesses.add(guess);
        return guess;
    }
    public List<Integer> getGuessHistory() {
        return guesses;
    }
}
