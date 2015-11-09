import java.util.*;

public class EmployeeConsoleView extends Employee{ //NO PARENTHSES!!!
/** extends produces a subclass EmployeeConsoleView of class Employee        **/
/** EmployeeConsoleView inherits all methods and variables of class Employee **/
/** This was very cool!!!                                                    **/    

    public static String getConsoleInput(Employee a) {
/*        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String b = userInput.nextLine();
        a.setName(b);   */
        System.out.println(a.getName() + " Inside getConsoleInput");
        return a.getName();
    }

    public static Employee putConsoleInput(Employee a) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String b = userInput.nextLine();
        a.setName(b);   
        System.out.println(a.getName() + " Inside PUTConsoleInput for Name");
        System.out.print("Please enter your SSN: ");
        String c = userInput.nextLine();
        a.setSsn(c);
        System.out.println(a.getSsn() + " Inside PUTConsoleInput for SSN");
        System.out.println(a.getName() + " Inside PUTConsoleInput for Name");
        System.out.print("Please enter your salary: ");
        double d = userInput.nextDouble();
        a.setSalary(d);
        return a;
    }

        
}      

