// Multiple.java
// Program determines if the first number entered is a multiple 
// of the second number entered.
package multiple;
import java.util.Scanner;

public class Multiple 
{
   public static void main(String[] arg)
   {
      Scanner input = new Scanner(System.in);

      int firstNumber; 
      int secondNumber;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      // determine whether firstNumber is a multiple of secondNumber
      if (firstNumber % secondNumber == 0)
         System.out.printf("%d is a multiple of %d%n", 
            firstNumber, secondNumber);
      
      if (firstNumber % secondNumber != 0)
         System.out.printf("%d is not a multiple of %d%n", 
            firstNumber, secondNumber);
   } // end main
} // end class Multiple