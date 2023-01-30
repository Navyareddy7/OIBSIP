import java.util.Random;
import java.util.Scanner;
public class Game  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(0,100);
        int k;
        int guesscount=1;
        System.out.println();
        System.out.println("NUMBER GUESSING GAME..");
        System.out.println();
        System.out.println("YOU HAVE 3 CHANCES TO GUESS THE NUMBER");
        System.out.println();
        while(guesscount<=3){
            System.out.println();
            System.out.println("GUESS COUNT:"+guesscount);
            System.out.println("enter your guess: ");
            k=sc.nextInt();
            if(k>n){
                System.out.println("you have entered greater value: ");
                if(guesscount!=3) {
                    System.out.println("please try again..!");
                }
                guesscount++;
            }


            else if(k<n){
                System.out.println("You have entered smaller value: ");
                if(guesscount!=3){
                    System.out.println("please try again..!");

                }

                guesscount++;
            }
            else{
                System.out.println("HURRAY......YOU WON");
            }
        }
        if(guesscount==4){
            System.out.println();
            System.out.println("Better luck next time!");
            System.out.println("The correct guess is: "+n);
        }
    }
}
