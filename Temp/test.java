import java.text.DecimalFormat;

public class test   {
    public static void main(String[] args)  {
        double x = 4.333333333;
        double y = 1.222;
        System.out.println(formatMe(x));
//        System.out.println(y);
    }

    public static String formatMe(double x)    {
        DecimalFormat money = new DecimalFormat("$0.00");
        String y = money.format(x);      //THIS RETURNS A STRING!!~~!!!!
         return y;
    }
}
