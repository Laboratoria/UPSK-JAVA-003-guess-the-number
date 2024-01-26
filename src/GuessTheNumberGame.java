import java.util.Random;





public class GuessTheNumberGame {


   private static final Random random = new Random();

   //Número aleatorio entre 1 y 100 a adivinar en la partida actual
   private static int targetNumber;


   // Método de la clase


    public static void main(String[] args) {


        //mensaje de Bienvenida al juego
        //tomar el nombre
        //tomar la suposición

        System.out.println("----¡ Bienvenido a Guess the Number !-----");


        HumanPlayer humanPlayer = new HumanPlayer();


        System.out.println( humanPlayer.getName());
        Player player = new HumanPlayer();
        //checkGuess(player);

        //System.out.println( humanPlayer.makeGuess());




        //Generar número aleatorio
        int min = 1;
        int max = 100;

        targetNumber = random.nextInt(max - min + 1) + min;

        System.out.println( " Aquí el número aleatorio " + targetNumber);

        checkGuess(player);
    }
    private static void checkGuess(Player player) {

        //Ejecuta un turno

        //usar condicionales para alternar turnos

        //obtiene la suposición
        int guess = player.makeGuess();

        //si el numero es igual
        //si el numero es mayor
        //si el numero es menor

        //si es muy alto o muy bajo se debe continuar jugando
        //si es correcto, finaliza el juego

        while (guess != targetNumber) {
            if (guess < targetNumber) {
                System.out.println("Más alto...");
            } if (guess > targetNumber) {
                System.out.println("Más bajo...");
            }
            guess = player.makeGuess(); // Actualiza la suposición del jugador
        }
        System.out.println( " ¡Felicidades, adivinaste el número! ");
        // RECUERDA CONTINUAR EL JUEGO EN CASO INCORRECTO
        //EL ALEATORIO SOLO SE DEBE MOSTRAR UNA VEZ HASTA QUE ALGUIEN ADIVINE
        //USAR WHILE

    }

}
