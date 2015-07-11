import javax.swing.*;

public class TestForLoop    {
    /** Main Method */
    public static void main(String args[])	{
	//initialize sum
	double sum = 0.00, item = 0.01;

	//Add 0.01, 0.02, ..., 0.99, 1 to sum
	for (int count = 1; count < 100; count++)    {
	    sum += item;
	    item += 0.01;
	}
	//Display results
	JOptionPane.showMessageDialog(null, "The sum is " + sum,
	    "Box 1", JOptionPane.INFORMATION_MESSAGE);
    }
}


//this is fucking stupid as he shows in the book that using
// floats or doubles as a control variables cause an inaccurate result.
// He then goes on to state to use integers as control variables. 
