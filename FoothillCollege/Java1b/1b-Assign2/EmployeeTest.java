import java.util.*;

public class EmployeeTest {
    public static void main(String[] args)  {

        Employee a = new Employee();
        
/******************************************************************************/
//THIS WORKS SORT OF!!!!!!!!!! The idea works!!!  PART 1 of Assignment 2

//tests the counter is correctly displaying object count
        ArrayList<Employee> myList = new ArrayList<Employee>();
        for(int i = 1; i <= 3; i++)	
        	myList.add(new Employee("Samatha", "1234567", i)); //on the fly!!!!
//uses the new for loop to check object creation. Prints out the number of 
// objects created in the old for loop.       	
        for(Employee i:myList)  // this is the new for loop for (arrays?????)
			System.out.println(i);               
        System.out.println("Number of objects created: " + a.getCounter());
 
/****************************************************************************/       
		System.out.println(a);
		
  		EmployeeConsoleView d = new EmployeeConsoleView();
    	d.setConsoleInput(a);
    	System.out.println(d.getConsoleInput(a));
        d.getConsoleInput(a);

/* below creates two objects, a and b, of type Employee. These objects are   */
/*  stored in an arraylist. The arraylist is printed out using the new       */
/*  for loop.                                                                */
//		d.setConsoleInput(new Employee("steve","123456789",9876543));
		ArrayList<Employee> myListToo = new ArrayList<Employee>();   
		myListToo.add(new Employee("Erich","1234",300));
		myListToo.add(new Employee("tom","456",436)); 
    	for(int i = 0; i < myListToo.size(); i++)
		    System.out.println(myListToo.get(i));                
/******************************************************************************/
    }
}
