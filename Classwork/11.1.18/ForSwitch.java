/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forswitch;

/**
 *
 * @author anannini01
 */
public class ForSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
     String numToAlpha = "";
     
     for(int i=1; i<=5; i++){
         switch(i){
             case 1: numToAlpha += " A\n";
             break;
             case 2: numToAlpha += " B\n";
             break;
             case 3: numToAlpha += " C\n";
             break;
             case 4: numToAlpha += " D\n";
             break;
             case 5: numToAlpha += " E\n";
             break;
             default: numToAlpha += " ";
             break;
     }
     }
     System.out.println(numToAlpha);
             
        
    }
    
}
