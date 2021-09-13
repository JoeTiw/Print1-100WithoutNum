import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Joe {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInputReader = new Scanner(System.in);

        //rock paper scissor
        int rock = 0;
        int paper = 1;
        int scissor = 2;

        System.out.println("Enter 0 for ROCK or 1 for PAPER or 2 for Scissor");      //Ask player to choose a number

        int inputfromuser =  userInputReader.nextInt();  //take input from the user and store  it in result

        int result = inputfromuser ;
        int randNum  = (int) (Math.random() * 3);    //computer chooses a random number from 0-3

        if (result == rock && randNum==rock || result == paper && randNum == paper || result == scissor && randNum == scissor ){

            System.out.println("you tie");

            } else if (result == rock && randNum==scissor || result == paper && randNum== rock || result == scissor && randNum == paper){

            System.out.println("you win");

        }else{

            System.out.println("Computer wins");
            }
        }
    }





















      //  String [] arr = {"r", "p", "s"};




































