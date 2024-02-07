import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Scanner;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HumanPlayerTest {
    @Test
    public void getNameMock(){

        //Declarar el Mockito para Scanner
        Scanner scannerMock = mock(Scanner.class);

        //Hacer la igualdad con lo que se espera
        when(scannerMock.nextLine()).thenReturn("Mika");

        //Devuelve la línea esperada
        String name = scannerMock.nextLine();

        //Verifica si es correcto
        assertEquals("Mika",name);

    }
    @Test
    public void makeGuessMock(){

        //Declarar el Mockito para Scanner

        Scanner scannerMock = mock(Scanner.class);

        //Hacer la igualdad con lo que se espera
        when(scannerMock.nextLine()).thenReturn("42");

        //Devuelve la línea esperada
        String guess = scannerMock.nextLine();

        //Transforma la línea que es String en un entero
        int guessInt = Integer.parseInt(guess);



        //verifica si es correcto
        assertEquals(42,guessInt);
        // Verificamos que la suposición se agregó a la lista de conjeturas

    }

    @Test
    public void getGuessesMock(){

        // Crear un ArrayList<String> simulado
        ArrayList mockList = mock(ArrayList.class);

     // Especificar el comportamiento del objeto simulado
        // Simular la entrada en el índice 0
        when(mockList.get(0)).thenReturn("Entrada 1");
        // Simular la entrada en el índice 1
        when(mockList.get(1)).thenReturn("Entrada 2");
        // Simular la entrada índice 2
        when(mockList.get(2)).thenReturn("Entrada 3");


    }



}