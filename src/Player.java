// Importación de clases necesarias
import java.util.ArrayList;
import java.util.List;

// Definición de la clase abstracta Player
public abstract class Player {

    // Declaración de variables protegidas para el nombre del jugador y la lista de suposiciones
    protected String name;
    protected List<Integer> guesses;

    // Constructor de la clase que recibe el nombre del jugador
    public Player(String name) {
        this.name = name; // Asigna el nombre proporcionado al jugador
        this.guesses = new ArrayList<>(); // Inicializa la lista de suposiciones como una nueva lista vacía
    }

    // Método abstracto para realizar una suposición
    public abstract int makeGuess();

    // Método para obtener el nombre del jugador
    public String getName() {
        return name; // Devuelve el nombre del jugador
    }

    // Método para obtener la lista de suposiciones del jugador
    public List<Integer> getGuesses() {
        return guesses; // Devuelve la lista de suposiciones del jugador
    }
}