import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player{

    //método getName para obtener el nombre de la jugadora

    public String getName(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cúal es tu nombre?: ");

        String name = sc.nextLine();

        System.out.println("Bienvenido a Guess the Number " + name );

        return name;


    }




        //tomar la suposición de la jugadora
        public  int makeGuess() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese su suposición: ");

            return Integer.parseInt(sc.nextLine());

        }


        //almacena historial de partidas de la jugadora
        public ArrayList<Integer> getGuesses() {


            //Definir o declarar nuestro arreglo para suposiciones
            ArrayList<Integer> guesses = new ArrayList<>();


            //int numberOfTheGuess = 30;

            for (int i = 0; i <50; i++) {
                guesses.add(makeGuess());

            }



            System.out.println(guesses.size());






            return guesses;

        }


    }
