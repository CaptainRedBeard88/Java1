/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcontinue;

/**
 *
 * @author anannini01
 */
public class ForContinue {

public static void main(String[] args) {
               
     int sum = 0;
     
     for(int i=0; i<=10; i++){ //loop until reaches 10
         if(i == 3 || i == 6) {
             continue;
         }
         sum += i;
         System.out.printf("Sum: %d\n", sum);
     }
    
        
    }
}
