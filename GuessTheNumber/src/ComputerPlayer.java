public class ComputerPlayer extends Player {

    public ComputerPlayer(String name){
        super(name);

    }
    @Override
    public int makeGuess(int lowerNumber, int higherNumber) {
        // Genera el número en el centro del rango actual
        int myGuess = lowerNumber + (higherNumber - lowerNumber) / 2;

        //Guarda el numero
        this.guesses.add(myGuess);
        //Retorna el numero
        return myGuess;
    }
}