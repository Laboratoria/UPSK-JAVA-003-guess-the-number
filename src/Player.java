import java.util.Scanner;

public abstract class Player {
    private String name;
    protected int[] guesses;

    public abstract int makeGuess();

    public String getName(){
        return name;


    };

    public int[] getGuesses(){
        return guesses;

    };



}
