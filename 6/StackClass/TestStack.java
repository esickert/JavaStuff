import java.util.*;

public class TestStack  {
    /** main method */
    public static void main(String[] args)  {

//        java.util.Scanner userInput = new java.util.Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int number = userInput.nextInt();
        String stuff = "Using a stack to reverse a string";
        char[] charArray = stuff.toCharArray();
        System.out.println(charArray);
        
        Stack newStack = new Stack(6);

        for(int i = 0 ; i < stuff.length(); i++)    {
            newStack.push(charArray[i]);
        }
        System.out.println(newStack.peek());
        while (!newStack.empty())
            System.out.print(newStack.pop());
        System.out.println();
        
        System.out.println(newStack.convertArrayToString());
    }
}

        
