import java.util.*;

public class EmployeeConsoleView extends Employee	{ //NO PARENTHSES!!!
                         
    private Employee worker = new Employee();
    
    public void getConsoleInput() {  
         System.out.println(worker);
    }

    public Employee setConsoleInput() {
        Scanner userInput = new Scanner(System.in);
       	System.out.print("Please enter your name: ");
       	String b = userInput.nextLine();
       	worker.setName(b);
       	System.out.print("Please enter your SSN: ");
       	String c = userInput.nextLine();
       	worker.setSsn(c);
       	System.out.print("Please enter your salary: ");
       	double d = userInput.nextDouble();
       	worker.setSalary(d);
        System.out.println();
        return worker;  
    }
}      

