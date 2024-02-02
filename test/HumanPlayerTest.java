import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void testMakeGuessWithValidInput() {
        HumanPlayer humanPlayer = new HumanPlayer("carolina");
        InputStream inputStream = new ByteArrayInputStream("15\n".getBytes());
        Scanner scanner = new Scanner(inputStream);
        humanPlayer.setScanner(scanner);

        int guess = humanPlayer.makeGuess();

        assertEquals(15, guess);
        assertEquals(List.of(15), humanPlayer.getGuessHistory());
    }
    @Test
    void testMakeGuessWithInvalidInputThenValidInput() {
        HumanPlayer humanPlayer = new HumanPlayer("carolina");
        InputStream inputStream = new ByteArrayInputStream("fff\n11\n".getBytes());
        Scanner scanner = new Scanner(inputStream);
        humanPlayer.setScanner(scanner);

        int guess = humanPlayer.makeGuess();

        assertEquals(11, guess);
        assertEquals(List.of(11), humanPlayer.getGuessHistory());
    }


}