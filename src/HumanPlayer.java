import java.util.Scanner;

// Definición de la clase HumanPlayer que extiende la clase Player
public class HumanPlayer extends Player {
    private Scanner scanner; // Declara un objeto Scanner para leer la entrada del usuario

    // Constructor de la clase que recibe el nombre del jugador humano
    public HumanPlayer(String name) {
        super(name); // Llama al constructor de la clase base Player con el nombre proporcionado
        this.scanner = new Scanner(System.in); // Inicializa el objeto Scanner para leer la entrada del usuario desde la consola
    }

    // Sobrescribe el método makeGuess de la clase base Player
    @Override
    public int makeGuess() {
        // Imprime un mensaje para que el jugador humano ingrese su suposición en color púrpura
        System.out.print("\u001B[35m" + name + ", enter your guess: " + "\u001B[0m");
        int guess = scanner.nextInt(); // Lee la suposición del jugador humano desde la entrada estándar
        guesses.add(guess); // Agrega la suposición a la lista de suposiciones del jugador
        return guess; // Devuelve la suposición ingresada por el jugador humano
    }

    // Método para establecer el objeto Scanner
    public void setScanner(Scanner scanner) {
        this.scanner = scanner; // Establece el objeto Scanner proporcionado como el nuevo scanner del jugador humano
    }
}