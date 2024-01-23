import java.util.Scanner;

public class HumanPlayer {



        public  int makeGuess() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese su supocición: ");

            int guesses = Integer.parseInt(sc.nextLine());

            System.out.println("Tu número es " +  guesses);

            return 0;
        };
    }
