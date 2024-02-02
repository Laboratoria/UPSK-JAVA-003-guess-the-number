import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void makeGuess() {
        Player player = new Player("carolina") {
            @Override
            public int makeGuess() {
                return 27; //
            }
        };

        // Verificar que makeGuess devuelve el valor esperado
        assertEquals(27, player.makeGuess());
    }

    @Test
    void getName() {
        Player player = new Player("carolina") {
            @Override
            public int makeGuess() {
                return 6;
            }
        };

        // Obtener el nombre y verificar que sea el esperado
        assertEquals("carolina", player.getName());
    }

    @Test
    void testGetGuessHistory() {
        Player player = new Player("carolina") {
            private int guessCounter = 0;

            @Override
            public int makeGuess() {
                int guess = 5 + guessCounter;
                guessCounter++;
                guesses.add(guess);
                return guess;
            }
        };

        // Realizar algunas suposiciones
        player.makeGuess();
        player.makeGuess();
        player.makeGuess();

        // Obtener el historial de suposiciones y verificar la longitud
        List<Integer> guessHistory = player.getGuessHistory();
        assertEquals(3, guessHistory.size());
    }

    @Test
    void setName() {

        Player player = new Player("carolina") {
            @Override
            public int makeGuess() {
                return 20;
            }
        };

        // Establecer un nuevo nombre
        player.setName("daniel");

        // Obtener el nombre y verificar que sea el nuevo nombre
        assertEquals("daniel", player.getName());
    }

}