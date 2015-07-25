import java.util.*;

public class TestArrayToString    {

    public static void main(String[] args)  {

    double[] test1D = new double[5];

    double[][] test2D = new double[3][3];
    ArrayToString test = new ArrayToString(test1D);
    
    System.out.println(test1D);
    test.print1DArray(test1D);
    test.print2DArray(test2D);
    System.out.println(Arrays.deepToString(test2D) + "  ");  //Arrays is a class from util!!!!
    System.out.println();
    test.print2DArray(test2D);
    
    }
}
