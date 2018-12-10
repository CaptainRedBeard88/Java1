/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work3;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class Work3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        //get values from user
        System.out.println("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        
        if(length == width){ //checks for equal length and width
            System.out.println("That is a square!");
        } else {
        System.out.println("That is not a square");
        }
        
        
    }
}
