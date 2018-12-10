/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @Adriano Nannini 10/1/18
 */
public class Student {
    
    //create instance variables for student name (first, last) and exam grades
    private String firstName, lastName;
    private double exam1, exam2, exam3;
    
    
    //create get and set methods for each instance variable of Student class
    public void setFirstName(String n){
        firstName = n;  //n is local variable. erased from memory after done
    }
       public String getFirstName(){
        return firstName;
    }
    public void setLastName(String n){
        lastName = n;
    }   
    public String getLastName(){
        return lastName;
    }
    public void setExam1(double score){
        this.exam1 = score;
    }
    public double getExam1(double score){
        return exam1;
    }
    public void setExam2(double score){
        this.exam2 = score;
    }
        public double getExam2(double score){
        return exam2;
    }
    public void setExam3(double score){
        this.exam3 = score;
    }
        public double getExam3(double score){
        return exam3;
    }
    
        
    public double getAverage(){  //determines and returns exam average
        return (this.exam1 + this.exam2 + this.exam3)/3;
    }
    
    public void displayResult(){ //display student info
        System.out.printf("Student: %s %s has an exam average of: %.0f%% %n", this.firstName, this.lastName, getAverage());
    }
    
    
}
