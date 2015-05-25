public class Test     {
    public static void main(String[] args)  {

        String test = "This is a test";

        char[] testArray = test.toCharArray();

        System.out.println(test);
        for(int i = 0; i < testArray.length; i++)   {
            System.out.print(testArray[i] + " ");
        }
        String newString = new String(testArray);
        System.out.println("...and the new string is... " + newString);
    
    }
}
