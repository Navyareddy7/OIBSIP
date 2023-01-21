import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(0,100);
        int k;
        int guesscount=1;
        System.out.println("###NUMBER GUESSING GAME..###");
        System.out.println("you have 3 chances to guess the number");
        System.out.println();
        while(guesscount<=3){
            System.out.println("GUESS COUNT:"+guesscount);
            System.out.println("enter your guess: ");
            k=sc.nextInt();
            if(k>n){
                System.out.println("you have entered greater value ");
                System.out.println("please try again..!");
                guesscount++;
                System.out.println();
            }


            else if(k<n){
                System.out.println("You have entered smaller value");
                System.out.println("please try again..!");
                guesscount++;
                System.out.println();
            }
            else{
                System.out.println("HURRAY......YOU WON");
                break;
            }
        }
        if(guesscount==4){
            System.out.println("Better luck next time!");
            System.out.println("The correct guess is: "+n);
        }
    }
}
