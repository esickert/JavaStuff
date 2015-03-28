import javax.swing.*;

//There is less code than in TestWhile as the boolean expression
public class TestDoWhile	{
	/** Main method */
	public static void main(String args[])    {
		int data;
		int sum = 0;
		
		//keep reading data until the input is 0
		do	{
			//read  the next data
			String dataString = JOptionPane.showInputDialog(null,
				"Enter an integer value, \nThe program exits if the input is 0",
				"Box 1", JOptionPane.QUESTION_MESSAGE);
				
			data = Integer.parseInt(dataString);
			
			sum += data;
		}	while (data != 0);	
			
			JOptionPane.showMessageDialog(null, "The sum is " + sum,
				"Box 2", JOptionPane.INFORMATION_MESSAGE);
	}
}

    
