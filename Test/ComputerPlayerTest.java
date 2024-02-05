// Importación de la clase Assertions para realizar afirmaciones en las pruebas

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Definición de la clase ComputerPlayerTest para realizar pruebas en la clase ComputerPlayer
public class ComputerPlayerTest {

    // Método de prueba para verificar que las suposiciones generadas estén dentro del rango esperado
    @Test
    public void testGeneratedGuessInRange() {
        // Crear una instancia de ComputerPlayer con el nombre "Computer" para realizar la prueba
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Generar múltiples suposiciones y verificar si todas están dentro del rango esperado
        for (int i = 0; i < 1000; i++) {
            // Llamar al método makeGuess() para generar una suposición
            int guess = computerPlayer.makeGuess();

            // Verificar si la suposición está dentro del rango esperado (entre 1 y 100)
            assertTrue(guess >= 1 && guess <= 100, "Generated guess is out of range: " + guess);
        }
    }
}