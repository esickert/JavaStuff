import javax.swing.*;

public class TestWhile    {
    /** Main method  */
    public static void main(String args[])    {
	// Read in intial data
	String dataString = JOptionPane.showInputDialog(null,
	    "Enter an integer value, \nThe program exits if input is 0",
	    "Fucking Box 1 in TestWhile", JOptionPane.QUESTION_MESSAGE);
	    
	int data = Integer.parseInt(dataString);
	
	//keep reading data until input is 0
	 int sum = 0;
	 while (data != 0) {
	//this is the loop body
	    sum += data;	//this means sum = sum + data
	    
	    //read the next data
	    dataString = JOptionPane.showInputDialog(null,
		"Enter an integer value, \nthe program exits if the input is 0",
		"Fucking Box 2 in TestWhile", JOptionPane.QUESTION_MESSAGE);
	    data = Integer.parseInt(dataString);
	} //the loop body ends here
	
	JOptionPane.showMessageDialog(null, "The sum is " + sum,
	    "...Box 3 in TestWhile", JOptionPane.INFORMATION_MESSAGE);
    }
}
	
	
    
