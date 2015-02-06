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
