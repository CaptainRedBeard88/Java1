/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilecontinue;

/**
 *
 * @author anannini01
 */
public class DoWhileContinue {
//due 11/5
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;     //initialize incriment variable 

    //display values from 1 to 10 skipping 6       
        do{
            if(i == 6) { //if i = 6 i is incremented then loop printing value
            i++;  //is skipped
            continue;}
            
            System.out.println(i);
            i++;
        } while(i <=10); //quits if incrimented value is greater than 10
    }
        
    }

