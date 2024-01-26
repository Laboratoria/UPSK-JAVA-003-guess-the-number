public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        int guess = generateRandomGuess();
        guesses.add(guess);
        return guess;
    }

    private int generateRandomGuess() {
        // Implementa aquí tu lógica para generar una suposición automática
        return (int) (Math.random() * 100) + 1;
    }
}