public class TestRecursion2 {
    public static void main(String[] args)  {

        int n = 3;
        int m = 3;
        
        System.out.println(pow(n,m));

        } // end of main
        public static int pow(int base, int exponent)   {
            if (exponent == 0)   {
                return 1;  //base case
            }
            else
                return base * pow(base, exponent - 1);
        } //end of pow

}// end of class
