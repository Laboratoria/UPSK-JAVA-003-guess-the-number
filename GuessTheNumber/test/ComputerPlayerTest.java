import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {


    @Test
    public void testMakeGuess() {
        int lowerNumber = 0;
        int higherNumber = 100;

        ComputerPlayer computerPlayer = new ComputerPlayer("Computadora");
        int guess = computerPlayer.makeGuess(lowerNumber, higherNumber);

        //TESTEAR QUE EL NUMERO DEL GUESS ESTE ENTRE 0 Y 100
        assertTrue(guess >= lowerNumber && guess <= higherNumber);

        //TESTEAR QUE SE AGREGUE UN NUMERO POR LLAMADA
        assertEquals(1, computerPlayer.getGuesses().size());

        //TESTEAR QUE EL GUESS QUE LA COMPUTADORA SUPONGA SEA LA MITAD DEL RANGO
        int expected = lowerNumber + (higherNumber - lowerNumber) / 2;
        assertEquals(expected, computerPlayer.getGuesses().get(0).intValue());
    }
}