import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ComputerPlayerTest {
    @Test
    void testPlayerName() {
        String playerName = "Computer";
        ComputerPlayer computerPlayer = new ComputerPlayer(playerName);
        assertEquals(playerName, computerPlayer.getName());
    }
    @Test
    void testMakeGuess() {
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Realizar varios intentos y verificar que estén dentro del rango esperado
        for (int i = 0; i < 100; i++) {
            int guess = computerPlayer.makeGuess();
            assertTrue(guess >= 0 && guess <= 100);
        }

        // Verificar que la lista de historial de intentos no esté vacía
        List<Integer> guessHistory = computerPlayer.getGuessHistory();
        assertFalse(guessHistory.isEmpty());
    }


    @Test
    void testGetGuessHistory() {
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Realizar varios intentos
        for (int i = 0; i < 5; i++) {
            computerPlayer.makeGuess();
        }

        // Verificar que la lista de historial de intentos tenga la longitud esperada
        List<Integer> guessHistory = computerPlayer.getGuessHistory();
        assertEquals(5, guessHistory.size());
    }



}
