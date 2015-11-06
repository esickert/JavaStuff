import java.util.*;

public class EmployeeConsoleView extends Employee{ //NO PARENTHSES!!!
/** extends produces a subclass EmployeeConsoleView of class Employee        **/
/** EmployeeConsoleView inherits all methods and variables of class Employee **/    

    public static String getConsoleInput(Employee a) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String b = userInput.nextLine();
        a.setName(b);
        System.out.println(a.getName() + " Inside getConsoleInput");
        return a.getName();
    }

    public static String putConsoleInput(Employee a) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String b = userInput.nextLine();
        return b;
    }

        
}      

