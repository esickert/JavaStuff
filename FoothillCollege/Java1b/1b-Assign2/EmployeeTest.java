import java.util.*;
/*******************************************************************************/
/** Java 1b Assignment #2                                       Erich Sickert **/
/**                                                                           **/
/** This assignment creates 2 classes that make use of a given class Employee **/
/** In part 1 all methods and object are checked for functionality. A counter **/
/** method is also added, getCount(), to keep track of all instances of the   **/
/** class Employee created.                                                   **/
/** Part 2 creates the class EmployeeConsoleView. It includeds a methods that **/
/** prompts the user for input and another that will the print that input to  **/
/** the console.                                                              **/
/*******************************************************************************/ 

public class EmployeeTest {
    public static void main(String[] args)  {
        partOne();
        partTwo();
        partThree();
    }

        public static void partOne() {
            Employee roxanne = new Employee();
            Employee samantha = new Employee("Sam", "111-11-1111", 12000.00 );
            System.out.println(roxanne);
            System.out.println(samantha);
            System.out.println("Number of objects are: " +  samantha.getCount());
            System.out.println("Adding 7 more instances of class Employee (on the fly)) to test counter");
            ArrayList<Employee> myList = new ArrayList<Employee>();
            System.out.println("Testing object creation count");
            for(int i = 1; i <= 7; i++) 
                myList.add(new Employee());
            System.out.println("Number of objects (instances) are now: " +  samantha.getCount() + "\n");
        }

        public static void partTwo() {
            EmployeeConsoleView consoleInput = new EmployeeConsoleView();
            consoleInput.setConsoleInput();
            consoleInput.getConsoleInput();
        }

        public static void partThree()  {
            int num = 2;
            EmployeeConsoleView count = new EmployeeConsoleView();
            ArrayList<Employee> myList = new ArrayList<Employee>();
            for(int i = 0; i <= num;i++)  {
                EmployeeConsoleView d = new EmployeeConsoleView();
                myList.add(d.setConsoleInput());
//                System.out.println(myList.get(i));
            }
            for(int i = 0; i <= num; i++)    {
                System.out.println(myList.get(i)); 
            }
        }
}
