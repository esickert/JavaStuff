import javax.swing.JOptionPane;

public class TestConvertDigitToString	{
    //* main method  */
    public static void main(String args[])    {
    String a;

    //This is weird as Java converts the 2 to a string!! It works.
    a = "43210 " + (2.0 + 5.05);
    System.out.println(a);
    
    JOptionPane.showMessageDialog(null, a,
        " Strings and digits", JOptionPane.INFORMATION_MESSAGE);
    }
}    
