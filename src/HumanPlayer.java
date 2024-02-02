import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player{

    private static final Scanner scanner = new Scanner(System.in);

    /*public HumanPlayer(String name) {
        this.name = name;
        guesses = new ArrayList<>();
    }*/


    public HumanPlayer (){

        guesses= new ArrayList<>();


    }

    //método getName para obtener el nombre de la jugadora

    public  String getName(){
        //Scanner sc = new Scanner(System.in);

        System.out.println("¿Cúal es tu nombre? (presiona Enter después de ingresar tu nombre) : ");
        //String playerName = sc.nextLine();


        return scanner.nextLine();



    }




        //tomar la suposición de la jugadora
        public  int makeGuess() {

            //Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese su suposición: \n");
            int guess = Integer.parseInt(scanner.nextLine());

            //Agrega los intentos al array
            guesses.add(guess);
            return guess;

        }


        //almacena historial de partidas de la jugadora
        public ArrayList<Integer> getGuesses() {

            //Devuelve nuestro arreglo para suposiciones
            return (ArrayList<Integer>) guesses;

        }


    }
