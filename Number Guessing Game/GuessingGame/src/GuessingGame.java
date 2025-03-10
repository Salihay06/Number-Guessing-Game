import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args)  {
    
int guess,life=5,i=0;
Random rand=new Random();
Scanner scan=new Scanner(System.in);
int number=rand.nextInt(100);
boolean gamesituation=false,mistake=false;
int[] predictions=new int[5];
    System.out.println("Welcome to our number guessing game !");
    System.err.println("I picked a number between 0 and 99");

while(life>0){
    System.out.print("Your guess:");
    guess=scan.nextInt();
    if((guess<0) || (guess >99)){
        if(mistake){ 
        System.out.println("You made too many incorrectentries and lost 1 life");
        System.out.println("Your life" + --life);
    } else{
        mistake=true;
        System.out.println("Please enter a number between 0 and 99");
    }
    continue;
}
predictions[i++]=guess;
if(guess==number){
    gamesituation=true;
    break;
}else {
    System.out.println("False,Try again ! Your lfe:"+ --life);
}
 }
if(gamesituation){
System.out.println("Congratulations,you guessed right.");
System.out.println("Our number"+number);
System.out.println("Your life: "+life);
}else{
    System.out.println("You failed");
    System.out.println("Our number : "+number);
}
System.out.println("Your predictions : ");
for(int value:predictions){
    if(value!=0)
    System.err.print(value+",");
}
    }

}
