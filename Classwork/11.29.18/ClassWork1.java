/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork1;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class ClassWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       final int ARRAY_LENGTH = 10; //creates constant int of 10 to be used for array length
       int A[] = new int[ARRAY_LENGTH]; //new array length set to constant value
       
        for (int count = 0; count < A.length; count++) {
            System.out.println("Enter value: "); //prompt user for int to store in array element
            A[count] = input.nextInt();
        }
        
        A[6] = 15;
        
        System.out.println();
        //calls method to print list of array values
        printArray(A);
        

    }


    private static void printArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%d%n", B[i]);
        }
    }
}
