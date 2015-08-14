import java.util.*;

public class TestPayScaleTable    {

    public static void main(String[] args)  {
        
    double[][] pay = {{0.00, 20.00, 0.00, 35.00},  //[rows][columns] 
                     {0.00, 21.50, 29.00, 36.50},
                     {27.50, 29.00, 30.50, 38.00},
                     {0.00, 24.50, 38.00, 39.50},
                     {0.00, 0.00, 0.00, 0.00}};

    PayScaleTable table = new PayScaleTable(pay);
    
    String payTable = table.convertArrayToString(table.payScaleTable);
    System.out.println(payTable);  //this is correct!!!
    table.print2DArray(table.payScaleTable);
    System.out.println();
    
//NOTE THESE ARE USING printf() INSTEAD OF println()
//  An employee with pay grade 1 and 4 years experience
//  earns $26 per hour, so the output is: 26.00
    System.out.printf("An employee with grade 1 and 4 years experience "
                     + "makes $ %.2f  per hour.\n", table.rate(1,3));
    

//  An employee just starting at pay grade 2
//  earns $27.50 per hour, so the output is: 27.50
    System.out.printf("An employee with grade 2 and 0 years experience "
                     + "makes $ %.2f  per hour.\n", table.rate(2,0));

//  An employee with pay grade 2 and 1 year experience
//  earns $29 per hour, so the output is: 29.00
    System.out.printf("An employee with grade 2 and 1 years experience "
                     + "makes $ %.2f  per hour.\n", table.rate(2,1));

//  An employee with pay grade 3 and 2 years experience
//  earns $38 per hour, so the output is: 38.00
    System.out.printf("An employee with grade 2 and 1 years experience "
                     + "makes $ %.2f  per hour.\n", table.rate(3,2));
    }
}
