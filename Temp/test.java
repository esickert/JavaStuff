import java.util.*;

public class test   {
    public static void main(String[] args)  {

        double[][] pay = {{0.00, 20.00, 0.00, 35.00},  //[rows][columns] 
                        {0.00, 21.50, 29.00, 36.50},
                        {27.50, 29.00, 30.50, 38.00},
                        {0.00, 24.50, 38.00, 39.50},
                        {0.00, 0.00, 0.00, 0.00}};

        List<Integer> myList = new ArrayList<Integer>();
		myList.add(23456);
		System.out.println("Line 11 " + myList.get(0));

        test2 me = new test2(pay);
        
        System.out.println(me.toString());
    }
        
    
}
