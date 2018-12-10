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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer");
        int one = input.nextInt();
        System.out.println("Enter second integer");
        int two = input.nextInt();
        
        if(checkDivisible(one, two) == true)
            System.out.printf("%d is divisible by %d\n", one, two);
        else
            System.out.printf("%d is not divisible by %d\n", one, two);
        
    }
    
    public static boolean checkDivisible(int one, int two){
        return one % two == 0;
    }
}
