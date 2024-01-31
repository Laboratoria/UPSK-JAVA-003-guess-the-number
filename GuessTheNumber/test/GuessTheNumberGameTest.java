import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class GuessTheNumberGameTest {

    @Test
    void testCheckGuessCorrectGuess() {

        Player player = mock(HumanPlayer.class);
        when(player.makeGuess(anyInt(), anyInt())).thenReturn(42);
        when(player.getName()).thenReturn("Alice");
        when(player.getGuesses()).thenReturn(List.of(42));

        GuessTheNumberGame.targetNumber = 42;
        GuessTheNumberGame.lowerNumber = 0;
        GuessTheNumberGame.higherNumber = 100;

        boolean result = GuessTheNumberGame.checkGuess(player);

        assertTrue(result);
        verify(player).makeGuess(anyInt(), anyInt());
        verify(player).getGuesses();
    }
}
