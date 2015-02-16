import java.text.*;

public class decimalPoints	{
    public static void main(String[] args)	{
//****************************************************************
    System.out.println("Suggestion from stackoverflow.com");
    double d = 2.34568;
    DecimalFormat f = new DecimalFormat("##.000");
    System.out.println(f.format(d));    
//****************************************************************
    System.out.println("Suggestion from Foothill java class");
    System.out.println(25.25*25.25);
    System.out.println(((Math.round(25.25*25.25))*100)/100); 

    } //end od main
} //end of class WordsWithS
