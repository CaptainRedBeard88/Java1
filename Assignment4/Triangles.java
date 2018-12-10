/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

/**
 *
 * @author School
 */
public class Triangles {

    public void drawTriangles()
    {
        int row;  //10
        int column; //10
        int space = 1;
        
        //first triangle
        //use nested loops.  outer control row of astrisks
        //inner display one at a time
        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
        
        //second triangle
        for (row = 10; row >= 1; row--) {
            for(column = 1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();      
        //third triangle
        for (row = 1; row <= 10; row++) {
            for(column = 9; column >= row; column--){
                for (space = column;  space<= row; space--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        //fourth triangle
    }

    
}
