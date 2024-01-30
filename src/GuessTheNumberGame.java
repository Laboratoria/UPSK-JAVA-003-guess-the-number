import java.util.Random;
import java.util.ArrayList;





public class GuessTheNumberGame {


   private static final Random random = new Random();

   //Número aleatorio entre 1 y 100 a adivinar en la partida actual
   private static int targetNumber;


   // Método de la clase


    public static void main(String[] args) {


        //mensaje de Bienvenida al juego
        //tomar el nombre
        //tomar la suposición

        System.out.println("----¡ Bienvenido a Guess the Number !----- \n\nDebes adivinar un número entre 1 y 100 \n" );


        //HumanPlayer humanPlayer = new HumanPlayer();
        Player player = new HumanPlayer();

        System.out.println("hola " + player.getName() + " \n");

        //checkGuess(player);

        //System.out.println( humanPlayer.makeGuess());




        //Generar número aleatorio
        int min = 1;
        int max = 100;

        targetNumber = random.nextInt(max - min + 1) + min;

        System.out.println( "Aquí el número aleatorio " + targetNumber + "\n");

        checkGuess(player);


    }
    private static void checkGuess(Player player) {

        //Ejecuta un turno
        //usar condicionales para alternar turnos

        //obtiene la suposición
        int guess = player.makeGuess();
        int intentos = 1; //iniciamos en 1 para que nos entregue el número de intentos

        //si el número es igual
        //si el número es mayor
        //si el número es menor
        //si es muy alto o muy bajo se debe continuar jugando
        //si es correcto, finaliza el juego

        while (guess != targetNumber) {
            intentos++;
            if (guess < targetNumber) {
                System.out.println("¡ Incorrecto ! Ingresa uno más alto \n");
            } if (guess > targetNumber) {
                System.out.println("¡ Incorrecto ! Ingresa uno más bajo \n");
            }
            guess = player.makeGuess(); // Actualiza la suposición del jugador
        }
        System.out.println( " ¡Felicidades, adivinaste el número secreto en " + intentos + " intentos" );
        ArrayList<Integer> guesses = player.getGuesses();
        System.out.println("Historial de suposiciones: " + guesses);

        // RECUERDA CONTINUAR EL JUEGO EN CASO INCORRECTO
        //EL ALEATORIO SOLO SE DEBE MOSTRAR UNA VEZ HASTA QUE ALGUIEN ADIVINE
        //USAR WHILE

    }

}
