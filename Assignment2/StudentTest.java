
package student;

import java.util.Scanner;
/**
 *
 * @Adriano Nannini 10/1/18
 */
public class StudentTest {
    
    public static void main(String[] args){
        
        //create new object of Student class
        Student s1 = new Student();
        
        //Create Scanner class object to receive input from user
        Scanner input = new Scanner(System.in);
        
        //prints to screen to show initialized variables for s1 object
        s1.displayResult();
        
        //Begin prompting for user info
        System.out.println("Enter first name ");
        s1.setFirstName(input.nextLine());
        System.out.println("Enter last name");
        s1.setLastName(input.nextLine());
        System.out.println("Enter Exam 1 grade: ");
        s1.setExam1(input.nextDouble());
        System.out.println("Enter Exam 2 grade: ");
        s1.setExam2(input.nextDouble());
        System.out.println("Enter Exam 3 grade: ");
        s1.setExam3(input.nextDouble());
        
        //display modified student s1 object with modified variables
        s1.displayResult();
        
    }
}
