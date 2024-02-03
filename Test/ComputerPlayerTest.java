import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ComputerPlayerTest {

    @Test
    public void testGeneratedGuessInRange() {
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Generar múltiples suposiciones y verificar si todas están dentro del rango esperado
        for (int i = 0; i < 1000; i++) {
            int guess = computerPlayer.makeGuess();
            assertTrue(guess >= 1 && guess <= 100, "Generated guess is out of range: " + guess);
        }
    }
}