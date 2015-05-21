public class Loan   {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private static java.util.Date loanDate;

    /** construct a loan with interest rate 2.5, 1 year, and $1000   */
    public Loan()   {
        this(2.5, 1, 1000);
    }

    /** construct a  with specified annual interest rate, number of years and loan amount  */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)    {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /** return annualInterestRate */
    public double getAnnualInterestRate()   {
        return annualInterestRate;
    }

    /** set a new annualInterestRate  */
    public void setAnnualInterestRate(double annualInterestRate)    {
        this.annualInterestRate = annualInterestRate;
    }

    /** return numberOfYears */
    public int getNumberOfYears()   {
        return numberOfYears;
    }

    /** set a newnumberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** return loanAmount */
    public double getLoanAmount()   {
        return loanAmount;
    }

    /** set new loanAmount */
    public void setLoanAmount(double loanAmount)    {
        this.loanAmount = loanAmount;
    }

    /** find mopnthly paymemnt  */
    public double monthlyPayment()  {
        double monthlyInterestRate = annualInterestRate / 1200;  //this maybe 12 instead of 1200
        return loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    }

    /** find total payment */
    public double totalPayment()    {
        return monthlyPayment() * numberOfYears * 12;
    }

    /** return loan date  */
    public static java.util.Date getLoanDate() {
        return loanDate;
    }
}
