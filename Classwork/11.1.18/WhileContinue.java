/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilecontinue;

/**
 *
 * @author anannini01
 */
public class WhileContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num = 1;
    
    while(num <= 10){
        while(num == 3 || num == 6){
            num++;
        }
        System.out.println(num);
        num++;
    }
    
    }
    
}
