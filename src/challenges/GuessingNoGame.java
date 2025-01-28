package challenges;

import java.util.Scanner;

public class GuessingNoGame {
    int random;
    GuessingNoGame(){
        random=(int)Math.ceil(Math.random())*100;
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GuessingNoGame guessingNoGame=new GuessingNoGame();
        int guess;
        int result;
        do{
            System.out.println("Guess the Number");
            guess=sc.nextInt();
            result=guessingNoGame.guess(guess);
            if (result==0){
                System.out.println("Congrats your guess is Right");
            } else if (result<0) {
                System.out.println("Please Guess Higher");

            }else {
                System.out.println("Please Guess Lower");
            }

        }while (result!=0);

    }
}
