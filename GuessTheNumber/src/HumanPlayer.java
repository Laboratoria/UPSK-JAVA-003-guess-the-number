public class HumanPlayer extends Player {

    protected HumanPlayer(String name) {
        super(name);

    }

    @Override
    public  int makeGuess() {
        java.util.Scanner scanner = new java.util.Scanner (System.in);

        return scanner.nextInt();
    }
}