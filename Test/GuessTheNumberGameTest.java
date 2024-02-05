import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTheNumberGameTest {

    @Test
    void testCheckGuess_HumanGuessTooHigh() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        // Mock para simular un jugador humano
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        when(humanPlayerMock.makeGuess()).thenReturn(75); // Suposición demasiado alta

        // Mock para simular el número objetivo
        GuessTheNumberGame game = new GuessTheNumberGame();

        // Acceder al campo targetNumber mediante reflexión
        Field targetNumberField = GuessTheNumberGame.class.getDeclaredField("targetNumber");
        targetNumberField.setAccessible(true);
        targetNumberField.set(game, 50);

        // Obtener el método checkGuess de la clase GuessTheNumberGame mediante reflexión
        Method checkGuessMethod = GuessTheNumberGame.class.getDeclaredMethod("checkGuess", Player.class, int.class);
        checkGuessMethod.setAccessible(true);

        // Prueba de checkGuess() cuando la suposición humana es demasiado alta
        checkGuessMethod.invoke(game, humanPlayerMock, 75);

        // Acceder al campo gameWon mediante reflexión
        Field gameWonField = GuessTheNumberGame.class.getDeclaredField("gameWon");
        gameWonField.setAccessible(true);
        boolean gameWon = (boolean) gameWonField.get(game);

        // Verificar que el juego no esté ganado
        assertEquals(false, gameWon);
    }

    @Test
    void testCheckGuess_HumanGuessCorrect() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        // Mock para simular un jugador humano
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        when(humanPlayerMock.makeGuess()).thenReturn(50); // Suposición correcta

        // Mock para simular el número objetivo
        GuessTheNumberGame game = new GuessTheNumberGame();

        // Acceder al campo targetNumber mediante reflexión
        Field targetNumberField = GuessTheNumberGame.class.getDeclaredField("targetNumber");
        targetNumberField.setAccessible(true);
        targetNumberField.set(game, 50);

        // Obtener el método checkGuess de la clase GuessTheNumberGame mediante reflexión
        Method checkGuessMethod = GuessTheNumberGame.class.getDeclaredMethod("checkGuess", Player.class, int.class);
        checkGuessMethod.setAccessible(true);

        // Prueba de checkGuess() cuando la suposición humana es correcta
        checkGuessMethod.invoke(game, humanPlayerMock, 50);

        // Acceder al campo gameWon mediante reflexión
        Field gameWonField = GuessTheNumberGame.class.getDeclaredField("gameWon");
        gameWonField.setAccessible(true);
        boolean gameWon = (boolean) gameWonField.get(game);

        // Verificar que el juego esté ganado
        assertEquals(true, gameWon);
    }
}