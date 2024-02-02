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

        System.out.println("----¡ Bienvenido a Guess the Number !----- \n\nDebes adivinar un número entre 1 y 100 \n" );


        //HumanPlayer humanPlayer = new HumanPlayer();
        Player humanPlayer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();




        System.out.println("hola " + humanPlayer.getName() + " \n");


        //Generar número aleatorio
        int min = 1;
        int max = 100;

        targetNumber = random.nextInt(max - min + 1) + min;

        System.out.println( "Aquí el número aleatorio " + targetNumber + "\n");

        checkGuess(humanPlayer,computerPlayer);




    }
    private static void checkGuess(Player humanPlayer, Player computerPlayer) {


        Player currentPlayer = humanPlayer;


        //Ejecuta un turno
        while (true){


            //Usar condicionales para los turnos
            //System.out.println("Turno de " + currentPlayer.name + ":\n");


            //usar condicionales para alternar turnos

            //obtiene la suposición
            int guess = currentPlayer.makeGuess();



            //sumar intentos de cada uno
            int humanAttempts = 1; //iniciamos en 1 para que nos entregue el número de intentos
            int computerAttempts=1;




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

                //intentos++;
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




            //muestra mensaje final y el historial de cada jugador

            System.out.println("¡Felicidades,  has adivinado el número secreto en " + humanAttempts + " intentos\n");
            System.out.println("La computadora realizó " + computerAttempts + " intentos\n");
            System.out.println("Tu historial de suposiciones de suposiciones es : "  + humanPlayer.getGuesses());
            System.out.println("Historial de suposiciones de la computadora : " + computerPlayer.getGuesses());

            // Verificar quién ganó






            if (guess == targetNumber) {

                break; // Terminar el juego
            }




        }







        // RECUERDA CONTINUAR EL JUEGO EN CASO INCORRECTO
        //EL ALEATORIO SOLO SE DEBE MOSTRAR UNA VEZ HASTA QUE ALGUIEN ADIVINE
        //USAR WHILE

    }



}
