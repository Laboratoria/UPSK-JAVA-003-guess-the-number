import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private final String name;
    protected ArrayList<Integer> guesses;

    protected Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public abstract int makeGuess(int lowerNumber, int higherNumber);
    public String getName() {
        return name;
    }
    public List<Integer> getGuesses() {
        return guesses;
    }
}