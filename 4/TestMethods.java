public class TestMethods	{
    public static void main(String[] args)	{
    int number = 0;
    int x = 1, y = 3;

    number = max(x,y);

    System.out.println(number);
    
    }  //end of main
    
    public static int max(int num1, int num2)   {
    int result;

    if (num1 > num2)
        result = num1;
    else
        result = num2;
    return result;
    } //end of method max
}  //end of class TestMethods
