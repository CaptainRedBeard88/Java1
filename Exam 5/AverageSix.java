/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagesix;
import java.util.Scanner;

 public class AverageSix
{
   public void getGrades()
   {
      Scanner input = new Scanner( System.in );

      System.out.println( "Please enter the number of students you wish to average" );  
      int students2 = input.nextInt();

      int NumOfStudents = students2; 
      int counter = 1;  
      double total = 0, previousNumber = 0, newMaximum = 0, newMinimum = 0; 

      while ( students2 > 0 ) 
      {    
         System.out.println( "Please enter a grade" ); 
         double givenNum = input.nextDouble();
         total = total + givenNum; 

         if ( counter == 1 ) 
         {
            previousNumber = givenNum; 
            newMinimum = givenNum; 
         } // end if

         if ( newMaximum < givenNum )
            newMaximum = maximum( previousNumber, givenNum );

         if ( newMinimum > givenNum )
            newMinimum = minimum( previousNumber, givenNum ); 

         students2--;
         counter++; 
         previousNumber = givenNum;
      } // end while

      double average1 = average( total, NumOfStudents ); 

      System.out.printf( "The maximum: %.2f\nThe average: %.2f\nThe minimum: %.2f\n", 
         newMaximum, average1, newMinimum);
   } // end method getGrades
   
   
   public double average(double x, double y)
{
   return (x/y); 
} // end method average

public double maximum( double x, double y )
{
   return Math.max( x, y ); 
} // end method maximum

public double minimum( double x, double y )
{
   return Math.min(x, y );
} // end method minimum

} // end class AverageSix

