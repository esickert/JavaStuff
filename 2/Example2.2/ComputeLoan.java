import javax.swing.*;

public class ComputeLoan   {
   /** Main method */
   public static void main(String[] args)   {
      //enter yearly interest rate
      String annualInterestRateString = JOptionPane.showInputDialog (
         null, "Enter yearly interest rate, for example 8.25 :",
         "First dialog box", JOptionPane.QUESTION_MESSAGE);
         
      //Convert string to double
      double annualInterestRate = 
         Double.parseDouble(annualInterestRateString);
         
      System.out.println(annualInterestRate);
         
      //Obtain monthly interest rate
      double monthlyInterestRate = annualInterestRate / 1200;
      
      //Enter number of years
      String numberOfYearsString = JOptionPane.showInputDialog(null,
         "Enter number of years as an interger, \nfor example 5 :",
         "Number of years", JOptionPane.QUESTION_MESSAGE);
         
      //convert string to integer
      int numberOfYears = Integer.parseInt(numberOfYearsString);
      
      System.out.println(numberOfYears);
      
      //enter loan amount
      String loanString = JOptionPane.showInputDialog(null,
         "Enter loan amount, for example 1200000.95: ",
         "Example lOAN aMOUNT", JOptionPane.QUESTION_MESSAGE); 
         
      //Convert string to double
      double loanAmount = Double.parseDouble(loanString);
      
      System.out.println(loanAmount);
      
      //calculate payment
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
      double totalPayment = monthlyPayment * numberOfYears * 12;
            
      System.out.println(monthlyPayment);
      System.out.println(totalPayment);  
      
      //format to keep 2 digits after the decimal point
      monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
      totalPayment = (int)(totalPayment * 100) / 100.0;
      
      System.out.println(monthlyPayment);
      System.out.println(totalPayment); 
      System.out.printf("output"); 
      
      //Display results
      String output = "The monthly payment is " + monthlyPayment +
         "\nThe total payment is " + totalPayment;
      JOptionPane.showMessageDialog(null, output,
         "Finally the end!!", JOptionPane.INFORMATION_MESSAGE);
         
      System.out.printf(output);   
     }     
 }
