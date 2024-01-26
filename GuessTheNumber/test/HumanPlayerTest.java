import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanPlayerTest {

    private InputStream originalSystemIn;

    @BeforeEach
    void setUp() {
        // Guarda la referencia original a System.in
        originalSystemIn = System.in;
    }

    @AfterEach
    void tearDown() {
        // Restaura System.in a su estado original después de cada prueba
        System.setIn(originalSystemIn);
    }

    @Test
    void givenName_whenReadFromInput_thenReturnCorrectResult() {
        // Simular la entrada del usuario con "Yennyfer"
        String simulatedInput = "Yennyfer";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        // Ejecutar el código que lee la entrada
        HumanPlayer playerName = new HumanPlayer("Yennyfer");
        String input = playerName.getName();

        // Verificar que el resultado sea correcto
        assertEquals("Yennyfer", input);
    }

    @Test
    void givenGuess_whenReadFromInput_thenReturnCorrectResult() {
        // Simular la entrada del usuario de un número entero (50 en este caso)
        String simulatedInput = "50";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testIn);

        // Ejecuta el código que lee la entrada
        HumanPlayer humanPlayer = new HumanPlayer("TestPlayer");
        int guess = humanPlayer.makeGuess(0, 100);
        List<Integer> guesses = humanPlayer.getGuesses();

        // Verifica que el resultado sea correcto
        assertEquals(50, guess);
        assertEquals(List.of(50), guesses);
    }
}
