import java.util.*;

public class Dups   {
    public static void main(String[] args)  {       

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Random randomGen = new Random();

        for (int i = 0; i < 10; i++)    {
            int randomInt = randomGen.nextInt(10);
            numberList.add(randomInt);
        } // end of for loop       THIS JUST LOADS THE ARRAY WITH RANDOM NUMBERS
        System.out.println(numberList);

        for (int i = 0; i < numberList.size(); i++)  {   
            for( int j = 1; j < numberList.size(); j++) {
                if (i == j)
                    continue;
                else if (numberList.get(i) == numberList.get(j)) {       
                    System.out.println(numberList.get(i) + " and " + numberList.get(j));
                    numberList.remove(j);
                } //end of if
            } //end of for loop
        } // end of for loop
        System.out.println(numberList);
    } //end of main
}//end of class Dups
