import java.util.*;

public class TestMe    {
    
    String stuff;
    
    TestMe()    {
    }
    
    TestMe(String a)    {
        stuff = a;
    }
    
    public void printMe(String a) {
        System.out.println(a);
    }
    
    public void printMeToo()    {
        System.out.println(stuff);
    }
    
    public void print3rd(String a, int N)  {
        String str = a;
        String newStr= "";
        for(int i = 0; i <= str.length(); i = i + N)    {
            newStr = newStr + str.substring(i,i+1);
        }
        System.out.println(newStr);
    }
    
    public void printNewTypeArray(int[]b)   {
        System.out.println("This is using the \"new\" for loop!!");
        for(int i: b)   {
            System.out.print(" " + b[i]);
        }
        System.out.println();
    }
    
    public void userInput()   {   //get user input from the console
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter  input: ");
        String input = userInput.nextLine();
        System.out.println("Your input is: " + input);
    }
    
    public void conditionalStatement(int num1,int num2,int num3)    {
        int max = 0;
        max = (num1 > num2) ? num1 : num2;  //conditional statement!!
        max = (max > num3) ? max : num3;
        System.out.println("The maximum is " + max);
    }
    
    
}

