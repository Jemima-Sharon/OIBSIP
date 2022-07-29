import java.util.*;
public class NumberGuessingGame
{
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        int Number=1+(int)(100*Math.random());
        int turns=10;
        System.out.println("It's a number Guessing game. Choose any number between 1 to 100 : ");
        System.out.println("NOTE : You only have 10 trials to guess the number.");
        System.out.println("ALL THE BEST!");
        System.out.println("----------YOUR GAME STARTS NOW----------\n");
        int i,score=10;
        for(i=1;i<=10;i++){
            System.out.print("Guess the number:");
            int guess=sc.nextInt();
            if(guess<0 || guess>100){
                System.out.println("INVALID NUMBER! GAME OVER...");
                break;
            }
            if(guess==Number){
            System.out.println("\nCONGRATULATIONS!! You won the game :)");
            System.out.println("You used "+i+" turns to guess the right number.");
            System.out.println("Your score is : "+(score-1)+"\n");
                break;
            }
            else if(guess>Number&&(i!=turns+1)){
                System.out.println("Your Number is Bigger! Turns left: "+(turns-i));
            } 
            else if(guess<Number && (i!=turns+1)){
                System.out.println("Your Number is Smaller! Turns left: "+(turns-i));
            }
            score--;
        }
        
        if(i>10){
            System.out.println("\nSORRY!! You lost the game :(\nBetter Luck next time.");
        System.out.println("The Right Number was: "+Number+"\n");
      }
    }
}
		