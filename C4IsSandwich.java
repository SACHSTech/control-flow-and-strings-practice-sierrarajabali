class C4IsSandwich extends ConsoleProgram {


 /**
 * A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or output the empty string "" if there are not two pieces of bread.
 * @author:
 */
  public void run() {
   String strBread;
   int intLastB;
   int intFirstB;
   String strMiddle;


   strBread = readLine("Enter a string with a word between 'bread': ");


   intFirstB = strBread.indexOf("bread");


   intLastB = strBread.indexOf("bread", intFirstB + 1);


   if (intFirstB != -1 && intLastB != -1 && intFirstB != intLastB) {
       strMiddle = strBread.substring(intFirstB + 5, intLastB);
       System.out.println(strMiddle);
   }
   else {
       System.out.println("");
   }
 }
}
