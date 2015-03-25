import java.util.*;

public class Hanoi  {

    public static void main(String[] args)  {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Please input number of disks: ");
    int num = userInput.nextInt();
    System.out.println("The moves are: ");
    moveDisks(num, 'A', 'B', 'C');
    

    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower)    {
        if (n == 1)
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else    {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disl=k " + n + " form " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
} // end of class    
