import java.util.*;

public class TestLoan   {

    /** main method  */
    public static void main(String[] args)  {
        
        double annualInterestRate = 0.00;
        int numberOfYears = 0;
        double loanAmount = 0.00;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter yearly interest rate, for example 8.25: ");
        annualInterestRate = userInput.nextDouble();

        System.out.print("Please enter loan amount, for example 120000.95: ");
        loanAmount = userInput.nextDouble();

        System.out.print("Please enter number of years as an interger, for example 5: ");
        numberOfYears = userInput.nextInt();
    
        //create loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        double monthlyPayment = (int)(loan.monthlyPayment() * 100) / 100.0;
        double totalPayment = (int)(loan.totalPayment() * 100) / 100.0;
    
        //display results
        System.out.println("The loan was created on "
            + Loan.getLoanDate().toString()   //what the FUCK is this toString()!!!!!!
            + "\nThe monthly payment is "     //runtime error- monthlyPayment is weird.
            + monthlyPayment
            + "\nThe total payment is "      // runtime error- totalPayment is always 0!!
            + totalPayment);

    }
}
        
