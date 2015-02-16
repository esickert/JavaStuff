/***********************************************************************/
/** Assignment 4                                      Erich Sickert     
/*                                                                     
/*  "Write a program that reads in 10 temperature values (as doubles)
/*   for 10 days of weather, computes the average temperature, and
/*   displays the number of days that were hotter than  the average." 
/***********************************************************************/
import java.util.*;
import java.text.*;          //used to format decimal output to 2 places

public class TemperatureOfTheDay    {
    /** main method */
    public static void main(String[] args) {

        final int DAYS = 10;                //sets the number of days
        double[] degrees = new double[DAYS];

        degrees = getInput(degrees);
        pauseMessage();                     //pauses the program for effect. :-)
        calculation(degrees);
    
    } //end of main
/***********************************************************************/ 
/** method getInput prompts the user for the temperature of each day
/*  which it loads into each element of an array. It then passes that
/*  array back to main.
/***********************************************************************/    
    public static double[] getInput(double[] anArray)   {   
        Scanner userInput = new Scanner(System.in);
        for(int i = 0; i < anArray.length; i++) {
            System.out.print("Please enter day " + (i + 1) + "'s highest temperature: ");
            double input = userInput.nextDouble();
            anArray[i] = input;
        } //end of for loop
        return anArray;
    } //end of getInput
    
/***********************************************************************/
/** pauseMessage is me playing around with java code and effects. It uses
/*  a try-catch block to "catch" an exception that would normally be 
/*  displayed if I used Thread.sleep() by itself. Thread.sleep() pauses
/*  the application for effect. It can be commented out if it's too much.   
/***********************************************************************/ 
    public static void pauseMessage()    {
        System.out.println("Okay, thankyou...Please wait!");
        try {
            Thread.sleep(5000);                  // 1000 milliseconds is one second.
        } catch(InterruptedException exception){ // Causes the application to pause for 5 secs
            Thread.currentThread().interrupt();  // for effect  :-).  Uses try-catch 
        } //end of try-catch                
    }  //end of pauseMessage

/***********************************************************************/
/** method calculation takes an array of temperatures as an argument
/*    and calculates the average temperature and number of days that
/*    were hotter than that average.
/***********************************************************************/  
    public static void calculation(double[] myArray)    {
        DecimalFormat decimalf = new DecimalFormat("##.00"); //formats output to 2 decimal places
        int count = 0;
        double sum = 0;
        for (int i=0; i <  myArray.length; i++) { 
            sum += myArray[i];
        } //end of for loop
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > (sum / myArray.length))
                count++;
        } //end of for loop
        double average = sum / myArray.length;
        System.out.println("The average temperature was " + decimalf.format(sum / myArray.length));
        System.out.println("There were " + count + " days above the average of "
                      + decimalf.format(sum / myArray.length));
    }  //end of calculation
} //end of class TemperatureOfTheDay
