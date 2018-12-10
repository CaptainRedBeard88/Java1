/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anannini01
 */
public class EmployeeTest {
    
        public static void main(String[] args) {
      
     Employee e1 = new Employee("Adriano", "Nannini", 2400);
     Employee e2 = new Employee("That", "Intern", 1200);
     e2.setMonthlySalary(-200);
            
     
     e1.displayEmployeeInfo();
     e2.displayEmployeeInfo();
            }
}
