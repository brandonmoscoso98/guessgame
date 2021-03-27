package Spring2021;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[]args){

        //step 1:
        Scanner scan = new Scanner(System.in);


        Random rand = new Random();
        int secNum = rand.nextInt(100);
        //step 2:
        int upperRng = 100;
        int lowerRng = 0;
        int count = 0;

        //Multiplayer feature (CPU)
        while(count <10){

            int guessNum = (lowerRng + upperRng) /2;

            if (guessNum == secNum){
                System.out.println(" CPU Wins!");
                System.out.println("the secret number was "+ guessNum);
                break;
            }
            if(guessNum < secNum){
                System.out.println(" CPU guess is too low: "+ guessNum);
                lowerRng = guessNum;
            }else{
                System.out.println(" CPU guess is too high: "+ guessNum);
                upperRng = guessNum;
            }
            System.out.println("Remaining tries: "+ (10-count));
            count = count + 1;

            //Multiplayer feature (User)
            while(count <=10) {
                System.out.println("Guess the number: ");
                int userGuess = scan.nextInt();
                System.out.println("Remaining tries: "+(10-count));
                count = count + 0;

                if (userGuess == secNum) {
                    System.out.println(" You Win! The number was "+userGuess);
                    break;
                }
                if (userGuess < secNum) {
                    System.out.println(" Your guess is too low: " + userGuess);
                    break;
                }
                if (userGuess > secNum) {
                    System.out.println(" Your guess is too high: " + userGuess);
                    break;
                }
            }


        }
    }
}
