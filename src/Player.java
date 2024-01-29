import java.util.ArrayList;


public abstract class Player {
    private final String name;
    protected ArrayList<Integer> guesses;

    public Player() {

        this.name = null;  // o this.name = "NombrePredeterminado";
        this.guesses = new ArrayList<>();
    }


    public abstract int makeGuess();

    public String getName(){
        return name;


    }

    public ArrayList<Integer> getGuesses(){
        return guesses;

    }



}
