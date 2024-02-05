// Definición de la clase ComputerPlayer que extiende la clase Player
public class ComputerPlayer extends Player {

    // Constructor de la clase que recibe el nombre del jugador de computadora
    public ComputerPlayer(String name) {
        super(name); // Llama al constructor de la clase base Player con el nombre proporcionado
    }

    // Sobrescribe el método makeGuess de la clase base Player
    @Override
    public int makeGuess() {
        int guess = generateRandomGuess(); // Genera una suposición automática
        System.out.println("Computer guessed: " + guess); // Imprime la suposición generada por la computadora
        guesses.add(guess); // Agrega la suposición a la lista de suposiciones del jugador
        return guess; // Devuelve la suposición generada por la computadora
    }

    // Método privado para generar una suposición automática
    private int generateRandomGuess() {
        // Genera un número aleatorio entre 1 y 100 como suposición de la computadora
        return (int) (Math.random() * 100) + 1;
    }
}