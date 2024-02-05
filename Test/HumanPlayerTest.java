// Importación de las clases Assertions y Test de JUnit Jupiter para realizar afirmaciones en las pruebas

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Definición de la clase HumanPlayerTest para realizar pruebas en la clase HumanPlayer
public class HumanPlayerTest {

    // Método de prueba para verificar el funcionamiento de makeGuess() en HumanPlayer
    @Test
    public void testMakeGuess() {
        // Simulación de entrada del usuario
        String input = "50"; // Suposición del usuario
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Mock del nombre del jugador
        String name = "TestPlayer";
        HumanPlayer player = new HumanPlayer(name);

        // Inicialización de scanner
        player.setScanner(scanner);

        // Verificación de la suposición realizada
        assertEquals(50, player.makeGuess());

        // Restablecer System.in
        System.setIn(System.in);
    }

    // Método de prueba para verificar el funcionamiento de getName() en HumanPlayer
    @Test
    public void testGetName() {
        // Creación de un jugador con un nombre específico
        String name = "TestPlayer";
        HumanPlayer player = new HumanPlayer(name);

        // Verificación de si el nombre devuelto por getName() coincide con el nombre esperado
        assertEquals(name, player.getName());
    }

    // Método de prueba para verificar el funcionamiento de getGuesses() en HumanPlayer
    @Test
    public void testGetGuesses() {
        // Creación de un jugador con un nombre específico
        String name = "TestPlayer";
        HumanPlayer player = new HumanPlayer(name);

        // Verificación de si la lista de suposiciones está vacía al inicio del juego
        assertTrue(player.getGuesses().isEmpty());
    }
}