/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work1;

/**
 *
 * @author anannini01
 */
public class Work1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int num = 19;
        
        while (num >= 1){
            if(num % 2 != 0){ //checks for remainder if divided by 2
                System.out.println(num); //displays int num if odd
            }
                    num--;  //decrement by 1
        }
    }
    
}
