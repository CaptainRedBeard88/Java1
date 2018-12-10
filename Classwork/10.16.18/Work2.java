/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;
import java.util.Scanner;

/**
 *
 * @author anannini01
 */
public class Work2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //prompt user for value
        System.out.println("Please enter a number: ");
        int usrNum = scanner.nextInt();
        
        if(usrNum > 0){
            System.out.println("Your number is positive");
        }
        if(usrNum < 0){
            System.out.println("Your number is negative");
        }
    }
    
}
