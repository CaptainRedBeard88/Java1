/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work1;
import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class Work1 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter an integer");
       int usrNum = input.nextInt();
       int remain = remainder(usrNum);
       //System.out.println("The remainder is " + remain);
       //System.out.println("The remainder is " + remainder(usrNum));
       if(remain == 0)
           System.out.println("This number is divisible by 7, no remainder");
       else
           System.out.printf("This number is not divisible by 7, remainder is %d\n", remain);
    }
    
    
    public static int remainder(int n)
    {
      return n%7;  
    }
    
}
