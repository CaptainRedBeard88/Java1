/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit;
import java.util.Scanner;
/**
 *
 * @author School
 */
public class Credit {

    public void calculateBalance()
    {
     Scanner input = new Scanner(System.in);
     int account;
     int oldBalance;
     int charges;
     int credits;
     int creditLimit;
     int newBalance;
     
     System.out.print("Enter Account Number (or -1 to quit): ");
     account = input.nextInt();
     
     while(account != -1){
     System.out.print("Enter Balance: ");
     oldBalance = input.nextInt();
     System.out.print("Enter Charges: ");
     charges = input.nextInt();
     System.out.print("Enter Credits: ");
     credits = input.nextInt();     
     System.out.print("Enter Credit Limit: ");
     creditLimit = input.nextInt();
     newBalance = oldBalance + charges - credits;
     
     if(newBalance > creditLimit){ 
         System.out.println("Credit Limit Exceeded");
     }else {
     System.out.println("New Balance is "+ newBalance);
     }
     System.out.print("Enter Account Number (or -1 to quit): ");
     account = input.nextInt();
     }//end while
     
    }

    
}
