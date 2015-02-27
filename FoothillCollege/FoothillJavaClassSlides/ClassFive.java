public class arrays {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] values = new int[5];//if you don't know in the beginning
        int[] example2 = {3, 2, 0, 5, 4};//if you know what's in the array
//        values = {3, 4, 5, 6, 7};
        values[0] =3;
        values [1] = 4;
        System.out.println(values[0]);
        values[0] = 5;

        System.out.println(values[0]);
        
        values = new int[10];
        System.out.println(values[0]);
        
        System.out.println("example "+example2[2]);
        someMethod(values);
        
        int var;
        var =5;
        int varr =5;
        
        int[] w;
        int[] x = null;
//        w = {2, 3, 4};
        w = new int[3];
        w[0] = 2.0;
        w[1] = 3;
//        System.out.println(w);
    }
    
    public static void someMethod(int[] someArray) {
        System.out.println(someArray.length);
    }
}
 

 


public class isDivisible {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean firstTry = isDivisible(4,2);
        boolean second = isDivisible(5,3);
        boolean third = isDivisible(7,2);
        System.out.println("Tries: "+firstTry+"  "+second+"  "+third);
    }
    
    //make a method that takes in two variables, integers
    public static boolean isDivisible(int n, int m) {

        //divide them and see if there is a reindeer
         double remainder = n%m;
         //if there is a remainder, I return false because that means not divisible
        if(remainder!=0) {
            return false;
         }
         else
             return true;
        //else  I return true because divisible
    }

}
 

 

I//make the method
public static void raiseToPower(double base, int exponent) {    
//make a loop because it's the same action several times
    double answer = base;
    boolean isNegative = false;
//    exponent = Math.abs(exponent);
    if(exponent<0) {
        isNegative = true;
        exponent = exponent*-1;
     }
    
    for(int i=0; i<exponent; i++) {
    //in the loop we want to find the answer of raising to the power
        //raising to the power means to multiply the base by itself the exponent number of timesOYe
        //base*base;
        answer = answer*base;    
    }
        
    //to print out the final result after multiplying
    if(isNegative) {
        answer = 1.0/answer;
        System.out.println("The answer is :"+answer);
     }
     else
        System.out.println("The answer is :"+answer);
    
}

 
