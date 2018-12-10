/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;
/**
 *
 * @author School
 */
public class Unique {
    
public void getNumbers(){
Scanner input = new Scanner(System.in);

    //create array holding 5 elements
    int[] numbers = new int[5];
    int count = 0; //count for user input
    int valid = 0; //count for valid responses

    //checks to see if count is less than the length of array
    while(count < numbers.length){
        System.out.printf("Enter number: ");
        try{ int usrNum = input.nextInt(); //get user input

        //checks to see if answer is valid
        if(usrNum >= 10 && usrNum <= 100){
    
            //create boolean object to check if any of the values in array
            //match the number given by the user
    boolean found = IntStream.of(numbers).anyMatch(n -> n == usrNum);
         
        //checks to see if a match has occured
        if(found){ System.out.printf("%d has already been entered%n", usrNum);
                    for (int i = 0; i < count; i++) {
                          //print valid array values
                    if(numbers[i] != 0)System.out.print(numbers[i] + " ");
                    } System.out.println();
                 }
        //checks to see if user answer is valid
        if(!found){ 
            numbers[valid] = usrNum; //stores valid values inside of array
            for (int i = 0; i <= valid; i++) {
                System.out.print(numbers[i] + " ");
            } System.out.println();
            valid++;  //increments valid variable
        }
            count++; //increments total number of in range responses
        }
        //display error message if input is out of bounds
        else System.out.println("Number must be between 10 and 100");
         
        } catch(InputMismatchException e) {
            System.out.println("Not an integer");
            break;
        }
}
}


    
}
