/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work4;
import java.util.Scanner;

/**
 *
 * @author anannini01
 */
public class Work4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double usrNum[] = new double[10]; //sets double array to hold 10 values
        double sum = 0;
        int i = 0; //i is counter
       
        while(i < 10){ //while loop to get values to fill array
        System.out.print("Enter a value: ");
        usrNum[i] = scanner.nextDouble();
        sum += usrNum[i];    //adds latest number to sum
        i++;  //incriment by 1
        }
        System.out.println("The sum is "+ sum); //display sum
        
        
        
        
        
        }
       
                
                
}
