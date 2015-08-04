import java.util.*;

public class TestPayScaleTable    {

    public static void main(String[] args)  {
        
    double[][] pay = {{0.00, 20.00, 27.50, 35.00},
                     {0.00, 21.50, 29.00, 36.50},
                     {0.00, 23.00, 30.50, 38.00},
                     {0.00, 24.50, 32.00, 39.50}};

    PayScaleTable table = new PayScaleTable(pay);
        
    String payTable = table.convertArrayToString(table.payScaleTable);
    System.out.println(payTable);  //this is correct!!!
    table.print2DArray(table.payScaleTable);
    System.out.println();
    
    System.out.println(table.rate(1,3));
//  An employee with pay grade 1 and 4 years experience
//  earns $26 per hour, so the output is: 26.00
    
    System.out.println(table.rate(2,0));
//  An employee just starting at pay grade 2
//  earns $27.50 per hour, so the output is: 27.50

    System.out.println(table.rate(2,1));
//  An employee with pay grade 2 and 1 year experience
//  earns $29 per hour, so the output is: 29.00

    System.out.println(table.rate(3,2));
//  An employee with pay grade 3 and 2 years experience
//  earns $38 per hour, so the output is: 38.00
    
    
    }
}
