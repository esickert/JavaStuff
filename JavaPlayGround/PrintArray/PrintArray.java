import java.util.*;

public class PrintArray {

    public static void main(String[] args)  {

//        String toString()   {
         
//        String[] stuff1 = {"hello", "world"};
//        String stuff2 = Arrays.toString(stuff1);
//        System.out.println(stuff2);

        double[][] stuffToo = {{0.00, 20.00, 27.50, 35.00},
                               {0.00, 21.50, 29.00, 36.50},
                               {0.00, 23.00, 30.50, 38.00},
                               {0.00, 24.50, 32.00, 39.50}};
        String stuff =  Arrays.deepToString(stuffToo);
        System.out.println(stuff);
    

    }
}
