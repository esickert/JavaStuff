import java.util.*;

public class TestPayScaleTable    {

    public static void main(String[] args)  {
        
    double[][] pay = {{0.00, 20.00, 27.50, 35.00},
                     {0.00, 21.50, 29.00, 36.50},
                     {0.00, 23.00, 30.50, 38.00},
                     {0.00, 24.50, 32.00, 39.50}};

    PayScaleTable table = new PayScaleTable(pay);
        
    String table = table.convertArrayToString(table.payScaleTable);
    System.out.println(table);  //this is correct!!!
    payScale.print2DArray(table.payScaleTable);
    System.out.println();
    
    }
}
