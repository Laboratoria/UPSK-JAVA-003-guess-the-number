
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GuessTheNumberGameTest {
    private GuessTheNumberGame game;
    @BeforeEach
    void setUp() {
        game = new GuessTheNumberGame();
    }


@Test
    public void testCheckGuessWithMockedPlayer() {
        Player mockedPlayer = mock(Player.class);
        when(mockedPlayer.makeGuess()).thenReturn(50);

        GuessTheNumberGame game = new GuessTheNumberGame();
        game.checkGuess(mockedPlayer);

    }

    @Test
    public void testCheckGuess_PlayerGuessIsGreaterThanTarget() {
        // Configuración del jugador simulado con Mockito
        Player mockedPlayer = mock(Player.class);
        when(mockedPlayer.makeGuess()).thenReturn(75);  // Número mayor que targetNumber

        // Crear una instancia de GuessTheNumberGame con el número objetivo
        GuessTheNumberGame game = new GuessTheNumberGame();  // Establecer un número objetivo para la prueba

        // Ejecutar el método que se está probando
        game.checkGuess(mockedPlayer);
    }


}