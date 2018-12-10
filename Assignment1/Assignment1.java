/*
Math program to recieve 3 inputs from user then calculate and 
display their sum, average, product, smallest and largest #s.
 */
package assignment1;
import java.util.Scanner;  //program uses class Scanner
import java.util.stream.IntStream;//program uses class IntStream
/**
 Adriano Nannini
 Assignment 1, due 9/20
 */
public class Assignment1 {
    //main method execution
    public static void main(String[] args) {
        
        //Creates scanner to obtain input from prompt
        Scanner input = new Scanner(System.in);
        //creates array inputArray of type Int set to hold 3 values
        int[] inputArray = new int[3];
        
        System.out.print("Enter integer 1: "); //prompt
        inputArray[0] = input.nextInt(); //read first value from user, stores
        //in array at [0]
        
        System.out.print("Enter integer 2: ");  //prompt
        inputArray[1] = input.nextInt(); //read 2nd value from user, stores
        //in array at [1]
        
        System.out.print("Enter integer 3: "); //prompt
        inputArray[2] = input.nextInt(); //read 3rd value from user, stores
        //in array at [2]
        
        //use IntStream to find sum.  stores int value in variable named sum
        int sum = IntStream.of(inputArray).sum();
        //create variable avg by dividing sum by the # of values in inputArray
        int avg = sum/inputArray.length;
        
        
        //create variable of name product, type int and sets value
        int product = 1;
        //creates loop.
        for(int i = 0; i < inputArray.length; i++){
            product *= inputArray[i];
        }
        
        int min = 0;
        int max = 0;
        for(int i = 0; i < inputArray.length; i++){
            min = inputArray[0];
            max = inputArray[0];
            if(min >= inputArray[i]){ 
                min = inputArray[i];
        }
            if(max <= inputArray[i]){ 
                max = inputArray[i];
            }
                i++;
        }
        
        
        System.out.printf("Sum: %d%nAvg: %d%nProduct: %d%nSmallest Number: %d%nLargest Number: %d%n", 
                sum, avg, product, min, max);
        
        
    }
    
}
