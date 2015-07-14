public class TestArrayToString    {

    public static void main(String[] args)  {

    double[] test1D = new double[5];
    ArrayToString test = new ArrayToString(test1D);
    
    System.out.println(test1D);
    test.print1DArray(test1D);
    System.out.println();
    
    }
}
