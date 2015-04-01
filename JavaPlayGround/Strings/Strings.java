import java.util.*;

public class Strings    {
    public static void main(String[] args)  {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String word = userInput.nextLine();
        System.out.print("Please enter a number: ");
        int number = userInput.nextInt();
        String str = "Hi", result;
        int n = 5;

        System.out.println(bounce(word,number));   

    }  //end of main

    public static String bounce(String str, int number)    {
        String result ="";
        for (int i = 0; i < number; i++) {   
            result = result + str;
        }
        return result;
    }
} // end of class
