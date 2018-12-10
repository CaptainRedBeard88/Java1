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
        double xValue = 10;
        
        /*while(xValue > 0){
            System.out.println(xValue);
            xValue -= .5;
        }*/
        int product =1, i = 0;
        while(i<=10){
            if(i%2 != 0) product *= i;
            System.out.println("Loop " +product);
            i++;
        }
        System.out.printf("%d\n", product);
    }
    
}
