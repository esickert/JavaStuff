import java.util.*;

public class EmployeeTest {
    public static void main(String[] args)  {

/******************************************************************************/
//THIS WORKS SORT OF!!!!!!!!!!

        Employee a = new Employee();
        Employee b = new Employee();
        
    	EmployeeConsoleView d = new EmployeeConsoleView();
/*        d.putConsoleInput(a);
        d.getConsoleInput(a);*/

/* below creates two objects, a and b, of type Employee. These objects are   */
/*  stored in an arraylist. The arraylist is printed out using the new       */
/*  for loop.                                                                */
		d.putConsoleInput(a);
		ArrayList<Employee> myList = new ArrayList<Employee>();   
		myList.add(a);
		myList.add(b); 
		for(Employee i:myList)
			System.out.println(i);                                        
//		System.out.println(myList.get(0));
//		System.out.println(myList.get(1));                



/******************************************************************************/
//        a.setName("erich");
//        System.out.println(a.getName());

//        b.setName("eric");
//        System.out.println(b.getName());

 //       a.setSsn("123.45.6789");
//        a.setSalary(123.00);

//        Employee c = new Employee("erik","111-11-1111",2.00);
//        System.out.println(c.getName());
//        System.out.println(a);
//        System.out.println(b);
 //       System.out.println(c);

 //       EmployeeConsoleView d = new EmployeeConsoleView();
//        d.putConsoleInput(a);
//        d.getConsoleInput(a);
        
//        System.out.println();
//        System.out.println(a);

    }
}
