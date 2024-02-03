import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTheNumberGameTest {

    @Test
    void testCheckGuess_HumanGuessTooHigh() {
        // Mock para simular un jugador humano
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        when(humanPlayerMock.makeGuess()).thenReturn(75); // Suposición demasiado alta

        // Mock para simular el número objetivo
        GuessTheNumberGame game = new GuessTheNumberGame();
        GuessTheNumberGame.targetNumber = 50;

        // Prueba de checkGuess() cuando la suposición humana es demasiado alta
        game.checkGuess(humanPlayerMock, 75);
        assertEquals(false, GuessTheNumberGame.gameWon); // El juego no debe estar ganado
    }

    @Test
    void testCheckGuess_HumanGuessCorrect() {
        // Mock para simular un jugador humano
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        when(humanPlayerMock.makeGuess()).thenReturn(50); // Suposición correcta

        // Mock para simular el número objetivo
        GuessTheNumberGame game = new GuessTheNumberGame();
        GuessTheNumberGame.targetNumber = 50;

        // Prueba de checkGuess() cuando la suposición humana es correcta
        game.checkGuess(humanPlayerMock, 50);
        assertEquals(true, GuessTheNumberGame.gameWon); // El juego debe estar ganado
    }
}