/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work1;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class Work1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a floating point number");
    double num = input.nextDouble();
    
    double result = halves(num);
    System.out.printf("Result is : %.2f%n", result);
    }
    
    public static double halves(double n){
        
        return n/2;
        
        
    }
    
}
