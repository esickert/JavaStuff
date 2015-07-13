import javax.swing.JOptionPane;
import java.util.Scanner;

public class ProgramAssignChap2   {
	//*  Main Method */
	public static void main(String[] args) {
	int x = 0, y = 0, z = 0, a =  0, b = 0;// num = 0;
		    
    //***************************************** 
    //the variable here is a string value, numString
String numString = JOptionPane.showInputDialog(null,
  "Please enter a number between 1 and 1000", "Chap 2 Programming Exercise",
   JOptionPane.QUESTION_MESSAGE);
       
    //we convert that string, numString, into an integer, num.   
    int num = Integer.parseInt(numString);
    
      JOptionPane.showMessageDialog(null, "Your number is too small? " + (num < 1000));
    JOptionPane.showMessageDialog(null, "Your number is too large? " + (num > 1000));
    //we print that integer in a dialog box
    JOptionPane.showMessageDialog(null, "Your number is " + num);
    JOptionPane.showMessageDialog(null, "The right most digit is " + (x = num % 10));
    JOptionPane.showMessageDialog(null, "Your number now is " + (y = num / 10));
    JOptionPane.showMessageDialog(null, "The right most digit is " + (z = y % 10));
    JOptionPane.showMessageDialog(null, "Your number now is " + (a = y / 10));
    JOptionPane.showMessageDialog(null, "The right most digit is " + (a = a % 10));
    JOptionPane.showMessageDialog(null, "Adding those digits together equals " + (z + x + a));  
    
    //see program exercise 2.6 in end of chapter 2
    //this uses the Javca 1.5 Scanner class
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     num = 0;
     num = keyboard.nextInt();
     System.out.println("You entered integer " + num);
     
     System.out.println (x = num / 10);
     System.out.println ( x = x / 10);
     System.out.println (x % 10);
     //System.out.println (93 / 10);
     //System.out.println (9 % 10); 
          
   System.out.println ("That's all folks!!");
   }
}
