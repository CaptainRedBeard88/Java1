/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;
//import java.util.Scanner;
/**
 *
 * @author anannini01
 */
public class DateTest {
    
        public static void main(String[] args) {
//Scanner input = new Scanner(System.in);

Date date1 = new Date(6,3,1987);
//method call
date1.setDay(15);
date1.displayDate();
//int x = date1.getMonth();
int y = date1.getDay();
int z = date1.getYear();
System.out.printf("Month is %d%n", date1.getMonth());

    }
        
}

