/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

//page 102, exercise 3.14
/**
 *
 * @author anannini01
 */
public class Date {

    private int month, day, year;
    
    
    //constructor MUST be public
    public Date(int m, int day, int y)//local variables
    { month = m;
      this.day = day;
      year = y; }
    
    //define methods
    public void setMonth(int m)
    { month = m; }
    public void setDay(int d)
    { day = d; }
    public void setYear(int y)
    { year = y; }

    public int getMonth()
    { return month; }
    public int getDay()
    { return day; }
    public int getYear()
    { return year; }
    
    public void displayDate()
    { System.out.printf("The date is: %d/%d/%d%n", getMonth(), getDay(), getYear()); }
}
