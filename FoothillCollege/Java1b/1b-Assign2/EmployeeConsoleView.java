/******************************************************************************/
/* Assignment 2, Java 1b                                       Erich Sickert  */
/*                                                                            */
/* This class has 2 methods that are used to set and get data from the class  */
/* employee. The user is prompted to input name, social security number, and  */
/* salary.                                                                    */
/******************************************************************************/
import java.util.*;

public class EmployeeConsoleView extends Employee	{ //NO PARENTHSES!!!
/* "extends" extends the subclass EmployeeConsoleView of class Employee          */
/* EmployeeConsoleView inherits all methods and variables of class Employee   */
/* I think!!!!!!                                                              */    

    public Employee getConsoleInput(Employee a) {
         return a;
     }

    public Employee setConsoleInput(Employee a) {

        Scanner userInput = new Scanner(System.in);
 // opens and then closes the IO session Scanner
        try	{
        	System.out.print("Please enter your name: ");
        	String b = userInput.nextLine();
        	a.setName(b);
          	System.out.print("Please enter your SSN: ");
        	String c = userInput.nextLine();
        	a.setSsn(c);
        	System.out.print("Please enter your salary: ");
        	double d = userInput.nextDouble();
        	a.setSalary(d);
        } finally {
        	userInput.close(); //this closes the IO session Scanner ????????
        } 
          return a;
    }
}      

