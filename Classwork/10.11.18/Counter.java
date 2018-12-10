/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //int[] usrArray = new int[9];
    
/*    int counter = 0;
    while(counter <= usrArray.length){
        System.out.println("Enter a value: ");
        usrArray[counter] = input.nextInt();
        System.out.printf("The number is %d%n", usrArray[counter]);
        counter++;
    }
 */   
  
/*    for(int i = 1; i <= 10; i++){
        System.out.printf("%d%n", i);
    }
*/    
int i = 10;
    while(i >= 1){
        System.out.printf("%d%n", i);
        i--;
    }
    
    }
    
}
