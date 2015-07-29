import java.util.*;

public class TestArrayToString    {

    public static void main(String[] args)  {

    double[] test1D = new double[5];


    double[][][] test2D = new double[3][3][7];
    ArrayToString test = new ArrayToString();

    
    System.out.println(test2D);
//    test.print1DArray(test1D);
//  test.print2DArray(test2D);
    String stuff = Arrays.deepToString(test2D);
    System.out.println(stuff);  //Arrays is a class from util!!!!
//    test.print2DArray(test2D);
    
    }
}
