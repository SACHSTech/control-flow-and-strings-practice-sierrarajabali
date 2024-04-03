import java.util.Random;
class B1DiceGame extends ConsoleProgram {
  
 /**
 * A program that lets you simulate the rolling of 100 pairs of dice. For each roll,
 * If the pair adds up to 2, print "snake eyes!"
 * If the pair adds up to 7, print "lucky seven"
 * if the pair adds up to any other sum, do not print out anything
 * @author: L. Wong
 */
 public void run() {
   int intTotal;
   int intDiceRoll1;
   int intDiceRoll2;
   int intOneHundred;
  
   for (intOneHundred = 1; intOneHundred <= 100; intOneHundred++){
       Random randomA = new Random();
       Random randomB = new Random();
       intDiceRoll1 = randomA.nextInt(6);
       intDiceRoll2 = randomB.nextInt(6);
      
   intTotal = intDiceRoll1 + intDiceRoll2;


   if (intTotal == 2){
       System.out.println("snake eyes!");
   }
   else if (intTotal == 7){
       System.out.println("lucky seven!");     
   }
  
   }
}
}
