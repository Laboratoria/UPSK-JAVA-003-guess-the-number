import java.util.Random;
//import java.util.ArrayList;





public class GuessTheNumberGame {


   private static final Random random = new Random();

   //Número aleatorio entre 1 y 100 a adivinar en la partida actual
   private static int targetNumber;


   // Método de la clase


    public static void main(String[] args) {


        //mensaje de Bienvenida al juego
        //tomar el nombre
        //tomar la suposición

        System.out.println("----¡ Bienvenido a Think Of a Number !----- \n\nDebes adivinar un número entre 1 y 100 \n" );


        //HumanPlayer humanPlayer = new HumanPlayer();
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();




        System.out.println("hola " + humanPlayer.getName() + " \n");


        //Generar número aleatorio
        int min = 1;
        int max = 100;

        targetNumber = random.nextInt(max - min + 1) + min;

        System.out.println( "Aquí el número aleatorio " + targetNumber + "\n");

        boolean humanWon = checkGuess(humanPlayer, computerPlayer);

        if (humanWon) {
            System.out.println("¡Has vencido a la computadora!\n");
        } else {
            System.out.println("La computadora te ha vencido por ahora");
        }
        System.out.println("Tu historial de suposiciones es: "  + humanPlayer.getGuesses());
        System.out.println("Historial de suposiciones de la computadora : " + computerPlayer.getGuesses());






    }
    private static boolean checkGuess(Player humanPlayer, Player computerPlayer) {


        Player currentPlayer = humanPlayer;
        //sumar intentos de cada uno
        int humanAttempts = 1; //iniciamos en 1 para que nos entregue el número de intentos
        int computerAttempts=0;//el de computer empieza en 0



        //Ejecuta un turno
        while (true){

            //Usar condicionales para los turnos
            //usar condicionales para alternar turnos

            //obtiene la suposición
            int guess = currentPlayer.makeGuess();

            //si el número es igual
            //si el número es mayor
            //si el número es menor
            //si es muy alto o muy bajo se debe continuar jugando
            //si es correcto, finaliza el juego

            while (guess != targetNumber) {

                //sumar intentos de cada uno en cada ciclo
                if (currentPlayer == humanPlayer){
                    humanAttempts++;

                }else{
                    computerAttempts++;

                }


                if (guess < targetNumber) {
                    System.out.println("¡ Incorrecto ! Ingresa uno más alto \n");
                } if (guess > targetNumber) {
                    System.out.println("¡ Incorrecto ! Ingresa uno más bajo \n");
                }


               // Alternar turnos
                if (currentPlayer == humanPlayer) {
                    currentPlayer = computerPlayer;
                } else {
                    currentPlayer = humanPlayer;

                }

                guess = currentPlayer.makeGuess(); // Actualiza la suposición del jugador

            }

            if (guess == targetNumber) {

                //muestra mensaje final y el historial de cada jugador

                if (currentPlayer == humanPlayer){
                    System.out.println("¡Felicidades,  has adivinado el número secreto en " + humanAttempts + " intentos");
                    System.out.println("La computadora realizó " + computerAttempts + " intentos\n");




                }else{
                    System.out.println("La computadora realizó " + computerAttempts + " intentos\n");
                    System.out.println("Mejor suerte a la próxima");


                }


                return currentPlayer == humanPlayer;
               // break; // Terminar el juego
            }

        }

        // RECUERDA CONTINUAR EL JUEGO EN CASO INCORRECTO
        //EL ALEATORIO SOLO SE DEBE MOSTRAR UNA VEZ HASTA QUE ALGUIEN ADIVINE
        //USAR WHILE

    }



}
