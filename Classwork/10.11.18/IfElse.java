/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter a number");
       
       int usrNum = input.nextInt();
       
       
       if(usrNum % 2 == 0) System.out.println("The number is even");
       else System.out.println("The number is odd");
    }
    
}
