import javax.swing.*;

public class InputDialogDemo  {
   /** Main Method  */
   public static void main(String arg[])  {
      //prompt user to enter a year
      String yearString = JOptionPane.showInputDialog(null,
         "Enter a year", "Example 2.1 Input (int)",
         JOptionPane.QUESTION_MESSAGE);
         
      //Convert the string into an int value
      int year = Integer.parseInt(yearString);
      
         
      //check if the year is a leap year
      boolean isLeapYear = 
      ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
            
      //display the results in a message dislog box
      JOptionPane.showMessageDialog(null,
         year + " is a leap? " + isLeapYear,
         "Example 2.1 Output (int)", JOptionPane.INFORMATION_MESSAGE);
            
	  //prompt the user to enter a double value
	  String doubleString = JOptionPane.showInputDialog(null,
	     "Enter a double value", "Example 2.1 Input (double)",
		 JOptionPane.QUESTION_MESSAGE);
		 
	  //covert the string into a double value
	  double doubleValue = Double.parseDouble(doubleString);
		 
	  //check if the number is positive
	  JOptionPane.showMessageDialog(null,
	     doubleValue + " is positive? " + (doubleValue > 0),
		 "Example 2.1 Output (double)",
		 JOptionPane.INFORMATION_MESSAGE);
	}
}
