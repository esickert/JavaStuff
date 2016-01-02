import java.util.*;

public class EmployeeConsoleView extends Employee	{ //NO PARENTHSES!!!
/* extends produces a subclass EmployeeConsoleView of class Employee          */
/* EmployeeConsoleView inherits all methods and variables of class Employee   */
/* I think!!!!!!                                                              */    
//    Employee worker = new Employee();

    public Employee getConsoleInput(Employee a) {
         return a;
     }

    public Employee setConsoleInput(Employee a) {

        Scanner userInput = new Scanner(System.in);
// opens and then closes the IO session Scanner
//        try	{
        	System.out.print("Please enter your name: ");
        	String b = userInput.nextLine();
        	a.setName(b);
          	System.out.print("Please enter your SSN: ");
        	String c = userInput.nextLine();
        	a.setSsn(c);
        	System.out.print("Please enter your salary: ");
        	double d = userInput.nextDouble();
        	a.setSalary(d);
//        } finally {
//        	userInput.close(); //this closes the IO session Scanner ????????
//        } 
          return a;
    }
}      

