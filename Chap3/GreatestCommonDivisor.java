import javax.swing.JOptionPane;

public class GreatestCommonDivisor	{
    //* Main method    */
    public static void main(String[] args)	{
    //prompt user to enter 2 integers
    String s1 = JOptionPane.showInputDialog(null, "Enter an integer",
	"Find the fucking GCD", JOptionPane.QUESTION_MESSAGE);
    int n1 = Integer.parseInt(s1);
    System.out.println(n1);

    String s2 = JOptionPane.showInputDialog(null, "Enter an integer",
	"The second fucking number", JOptionPane.QUESTION_MESSAGE);
    int n2 = Integer.parseInt(s2);
    System.out.println(n2);

    int gcd = 1;
    int a =1;
    while (a <= n1 && a <= n2)	{
	if (n1 % a == 0 && n2 % a == 0)	{
	    gcd = a;
	    System.out.println(gcd);
	}
	a++;
    }

    String output = "The greatest common divisor of " + n1 + " 
and " + n2
	+ " is " + gcd;
    JOptionPane.showMessageDialog(null, output,
	"The last BOX", JOptionPane.INFORMATION_MESSAGE);
    }
}
