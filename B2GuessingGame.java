import java.util.Random;
class B2GuessingGame extends ConsoleProgram {


 /**
 * lets the computer generate a secret number (an integer between 1 and 100, for your friend to guess.
 * If they guess too high, print: "too high, guess again." If they guess too low, print: "too low, guess again".
 * If they guess the number, let the program stop and print "congratulations". If they've guessed incorrectly after 5 attempts, print "Nice Try"
 * @author: L. Wong
 */
  public void run() {
   int intAttemps;
   int intSecret;
   int intGuess;


   Random randomA = new Random();
   intSecret = randomA.nextInt(1, 100);
  
   for (intAttemps = 1; intAttemps <=5; intAttemps++){
        intGuess = readInt("Guess a number between 1-100: ");
   if (intGuess == intSecret){
       intAttemps = 5;
       System.out.println("congratulations");
   }
   else if (intGuess < intSecret && intAttemps !=5) {
       System.out.println("too low, guess again");
   }
   else if (intGuess > intSecret && intAttemps !=5){
       System.out.println("too high, guess again");
   }
   else {
       System.out.println("Nice try");
   }
   }
 }  
}
