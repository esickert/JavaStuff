import javax.swing.*;

public class ComputeChange   {
   /** Main method  */
   public static void main(String[] args)   {
   //recieve the amount entered from the keyboard
   String amountString = JOptionPane.showInputDialog(null,
      "Enter an amount in double, for example 11.56",
      "First dialog box??? input", JOptionPane.QUESTION_MESSAGE);
      
   //convert string to double
   double amount = Double.parseDouble(amountString);
   
   System.out.println(amount);
   
   int remainingAmount = (int)(amount * 100);
   System.out.println(remainingAmount);
   
   //find the number of dollars
   int numberOfOneDollars = remainingAmount / 100;
   remainingAmount = remainingAmount % 100;
   System.out.println("line 22: The number of dollars are " + numberOfOneDollars);
   System.out.println("Whats remaining is " + remainingAmount);
   
   //find the number of quaters in the remaining amount
   int numberOfQuaters = remainingAmount / 25;
   remainingAmount = remainingAmount % 25;
   System.out.println("line: 28 The number of quaters are " + numberOfQuaters);
   System.out.println("And whats remain is " + remainingAmount);
   
   //find the number of dimes in the remaining amount
   int numberOfDimes = remainingAmount / 10;
   remainingAmount = remainingAmount % 10;
   System.out.println("line 34: The number of dimes are " + numberOfDimes + "\n");
   System.out.println("And what's left is "  + remainingAmount);  
   
   //find the number of nickels in the remaining amount
   int numberOfNickels = remainingAmount / 5;
   remainingAmount = remainingAmount % 5;
   System.out.println("The number of nickels are " + numberOfNickels);
   System.out.println("The remaining amount is " + remainingAmount);
   
   //find the number of pennies in the remaining amount
   int numberOfPennies = remainingAmount;
   System.out.println("line 45: The number of pennies are " + numberOfPennies);
   
   //Display the results in a nice box
   String output = "Your amount $" + amount + " consists of \n" +
      numberOfOneDollars + " dollars\n" +
      numberOfQuaters + " quarters\n" +
      numberOfDimes + " dimes\n" +
      numberOfNickels + " nickels\n" +
      numberOfPennies + " pennies" ;
    JOptionPane.showMessageDialog(null, output,
       "The last fucking box!!", JOptionPane.INFORMATION_MESSAGE);   
    }
}
