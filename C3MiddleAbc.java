class C3MiddleAbc extends ConsoleProgram {


 /**
 * Given a string, does "abc" appear in the middle of the string? To define middle, we'll say that the number of characters to the left and right of the "abc" must differ by at most one.
 * @author:
 */
  public void run() {
  
   String strAbc;
   int intLength;
   int intB;
   int intEnd;


   strAbc = readLine("Enter a string that contains abc: ");


   intLength = strAbc.length();
 
   intB = strAbc.indexOf("b");
   intEnd = intLength - intB - 1;
  
   if ((intEnd == intB || intEnd - intB == 1) || (intB - intEnd == 1)){
       System.out.println("true");
   }
   else {
       System.out.println("false");
   }
  
 }
}
