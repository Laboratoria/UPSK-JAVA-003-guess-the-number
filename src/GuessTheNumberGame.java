import java.util.Random;





public class GuessTheNumberGame {

    // Atributos de la clase
    //Generar un número aleatorio con random

   private static final Random random = new Random();

   //Número aleatorio entre 1 y 100 a adivinar en la partida actual
   private int targetNumber;


   // Método de la clase

    private static boolean checkGuess(Player player) {

        //Ejecuta un turno
        //obtiene la suposición
        // evalúa el nuevo estado de la partida


        return true;
    }

    public static void main(String[] args) {




        System.out.println("¡ Bienvenido a Guess the Number !");

        HumanPlayer humanPlayer = new HumanPlayer();

        System.out.println( humanPlayer.makeGuess());




        //Generar número aleatorio
        int min = 1;
        int max = 100;

        int targetNumber = random.nextInt(max - min + 1) + min;

        System.out.println( " Aquí el número aleatorio " + targetNumber);
    }


}
