import java.util.*;

public class TestArrayToString    {

    public static void main(String[] args)  {

    double[] test1D = new double[5];

<<<<<<< HEAD
    double[][][] test2D = new double[3][3][7];
    ArrayToString test = new ArrayToString();

    
    System.out.println(test2D);
//    test.print1DArray(test1D);
//  test.print2DArray(test2D);
    String stuff = Arrays.deepToString(test2D);
    System.out.println(stuff);  //Arrays is a class from util!!!!
=======
//    double[][] test2D = new double[3][3];
    ArrayToString test = new ArrayToString(test1D);
    
    System.out.println();
    test.print1DArray(test1D);
//    test.print2DArray(test2D);
//    System.out.println(Arrays.deepToString(test2D) + "  ");  //Arrays is a class from util!!!!
>>>>>>> 22aa39b97272ec6f238dfaf8d9e8e4c4f87e3d24
    System.out.println();
//    test.print2DArray(test2D);
    
    }
}
