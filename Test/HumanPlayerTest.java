import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HumanPlayerTest {

    @Test
    public void testMakeGuess() {
        // Simulación de entrada del usuario
        String input = "50";
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

    @Test
    public void testGetName() {
        String name = "TestPlayer";
        HumanPlayer player = new HumanPlayer(name);
        assertEquals(name, player.getName());
    }

    @Test
    public void testGetGuesses() {
        String name = "TestPlayer";
        HumanPlayer player = new HumanPlayer(name);
        assertTrue(player.getGuesses().isEmpty());
    }
}