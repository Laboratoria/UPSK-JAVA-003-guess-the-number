import java.util.Random;
import java.util.ArrayList;
//import java.util.Scanner;


public class ComputerPlayer extends Player{

    public ComputerPlayer (String name){
        this.name = name;
        guesses = new ArrayList<>();
        //super(name);

    }
    public ComputerPlayer() {
        guesses= new ArrayList<>();
    }

    //poner un nombre a la computadora
    public  String getName(){

        return "Computer Player";

    }


    public  int makeGuess() {

        //Generar un número aleatorio para la computadora

        //Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;

        Random random = new Random();
        int guess = random.nextInt(max - min + 1) + min;



        System.out.println("Número generado por la Computadora \n" + guess);
        //int guess = Integer.parseInt(sc.nextLine());

        //Agrega los intentos al array
        guesses.add(guess);
        return guess;

    }
    public ArrayList<Integer> getGuesses() {

        //Devuelve nuestro arreglo para suposiciones
        return (ArrayList<Integer>) guesses;

    }



}
