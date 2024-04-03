class B3DivisorCount extends ConsoleProgram {


    /**
    * A program DivisorCount that lets you enter an integer and that prints all the divisors of that number.
    * @author: L. Wong
    */
     public void run() {
   
   
      int intInteger;
   
   
      intInteger = readInt("Enter an integer: ");
   
   
      for (int intDivisors = 1; intDivisors <= intInteger; intDivisors++){
          if (intInteger % intDivisors == 0) {
              System.out.printf("%s%n", intDivisors);
          }
      }
    }
   }
   