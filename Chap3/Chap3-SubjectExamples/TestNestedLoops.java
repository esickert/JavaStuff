import javax.swing.JOptionPane;

public class TestNestedLoops    {
    //*  Main method  */
    public static void main(String args[])    {
	//Display the table heading
	//int i, j;
	String output = "Multiplication Table\n";
	output  += "----------------------------------\n";
        
	//Display the number title
	output += "  |  ";
	for (int j = 1; j <= 9; j++)
	    output += "   " + j;
	output += "\n";
	
	//print table body
	for (int i = 1;  i <= 9; i++)    {
	    output += i + " | ";
	    for(int j=1; j <= 9; j++)    {
	    //display the product and allign properly
	    if (i * j < 10)
	    //the number of spaces below needs to match the number of spaces
            //   in " " on line 14. This is to have single digit numbers line up with
            //   multiple digit numbers 
		output = output + ("   " + i * j);
	    else
		output += " " + i * j;
	    }
	output += "\n";
        }
    
    //Display result
    JOptionPane.showMessageDialog(null, output,
	"Example 3.4 on page 100 in book-5th Edtion", JOptionPane.INFORMATION_MESSAGE);
    }    
}

