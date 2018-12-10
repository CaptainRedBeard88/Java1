/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author anannini01
 */
public class Employee {

    private String firstName, lastName;
    private double monthlySalary;
    
    
    public Employee(String firstN, String lastN, double monthlyS){
        firstName = firstN;
        lastName = lastN;
        monthlySalary = monthlyS; }
    
    public void setFirstName(String f)
    {firstName = f;}
    public void setLastName(String l)
    {lastName = l;}
    public void setMonthlySalary(double s)
    { if (s < 0){monthlySalary = 0.0;}
    else {monthlySalary = s;} }
    
    public String getFirstName()
    {return firstName;}
    public String getLastName()
    {return lastName;}
    public double getMonthlySalary()
    {return monthlySalary;}

    public void displayEmployeeInfo()
    { System.out.printf("Employee %s %s makes $%.2f yearly%n", firstName, lastName, (monthlySalary * 12)); }
}
