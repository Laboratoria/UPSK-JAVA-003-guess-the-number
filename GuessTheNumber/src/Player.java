import java.util.List;

public abstract class Player {
    private final String name;
    protected List<Integer> guesses;

    protected Player(String name){
        this.name = name;
    }

    public abstract int makeGuess();
    public String getName(){
        return name;
    }
    public List<Integer> getGuesses(){
        return guesses;
    }

}