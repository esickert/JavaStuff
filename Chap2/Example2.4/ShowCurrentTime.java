import javax.swing.*;
import java.util.*;

public class ShowCurrentTime   {
   public static void main(String[] args)   {
     
       //This method returns the difference, measured in milliseconds,
       // between the current time and midnight, January 1, 1970 UTC(coordinated universal time-UNIX).
       //UNIX time (a.k.a. POSIX time or Epoch time) is a system for describing instants in time,
       //    defined as the number of seconds that have elapsed since 00:00:00 Coordinated Universal Time
       //    (UTC), Thursday, 1 January 1970
     
      //Obtain the total milliseconds since midnigtht, jan 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      System.out.println(totalMilliseconds);
      
      System.out.print("Current UNIX Time in milliseconds is ");
      System.out.println(System.currentTimeMillis());
      
      //Obtain the total seconds since midnight , jan 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
      System.out.println(totalSeconds);
      
      //Compute the current second in the minute in the hour 
      int currentSecond = (int)(totalSeconds % 60);
      System.out.println(currentSecond);
      
      //obtain the total minutes
      long totalMinutes = totalSeconds / 60;
      System.out.println(totalMinutes);
      
      //compute the current minute in the hour
      int currentMinute = (int)(totalMinutes % 60);
      System.out.println(currentMinute);
      
      //obtain the total hours
      long totalHours = totalMinutes / 60;
      
      //compute the current hour
      int currentHour = (int)(totalHours % 24);
      System.out.println(currentHour);
      
      //display results
      String output = "Current time is " + (currentHour) + ":"
         + currentMinute + ":" + currentSecond + " GMT";
      System.out.println(output);
      
      
      JOptionPane.showMessageDialog(null,output,
         "The last dialog box", JOptionPane.INFORMATION_MESSAGE);
 
	  JOptionPane.showMessageDialog(null,output);
	  
	  Date a = (Calendar.getInstance().getTime());
	  System.out.println(a);
	  
	  JOptionPane.showMessageDialog(null, a, "The parameters were wrtong!!", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, a, "Wrong", JOptionPane.INFORMATION_MESSAGE);
 }}
