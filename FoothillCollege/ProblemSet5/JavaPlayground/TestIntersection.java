import java.util.*;

public class TestIntersection   {
    public static void main(String[] args)  {

        ArrayList<Integer> numberList1 = new ArrayList<Integer>();
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
        ArrayList<Integer> numberList3 = new ArrayList<Integer>();
//  [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
        
/*        numberList1.add(1);
        numberList1.add(4);
        numberList1.add(8);
        numberList1.add(9);    
        numberList1.add(11);
        numberList1.add(15);
        numberList1.add(17);    
        numberList1.add(28);
        numberList1.add(41);
        numberList1.add(59);

// [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
        numberList2.add(4);
        numberList2.add(7);
        numberList2.add(11);
        numberList2.add(17);
        numberList2.add(19);
        numberList2.add(20);
        numberList2.add(23);
        numberList2.add(28);
        numberList2.add(37);
        numberList2.add(59);
        numberList2.add(4);    */

        Random randomGen = new Random();
        for (int i = 0; i < 7; i++)    {
            int randomInt = randomGen.nextInt(13);
            numberList1.add(randomInt);
          } // end of for loop             
        for (int i = 0; i < 11  ; i++) {
            int randomInt = randomGen.nextInt(15);
            numberList2.add(randomInt);
        } //end of for loop         */
        System.out.println("ArraylistA is " + numberList1);
        System.out.println("ArraylistB is " + numberList2);          

        numberList2.retainAll(numberList1);
        System.out.println(numberList2);

        for (int i = 0; i < numberList2.size() - 1; i ++)   {
            for (int j = 1; j < numberList2.size(); j++)    {   
                if (numberList2.get(i).equals(numberList2.get(i+1)))   {
                numberList2.remove(i + 1);
                i--;
                } //end of if
            } //end of for
        } //end of for
        System.out.println(numberList2);


/*        for (int i = 0 ; i < numberList2.size(); i++)   {
            if (numberList2.contains(numberList1.get(i)) == true) {  //don't forget the paraenthese
                System.out.println(numberList2.get(i));
                numberList3.add(numberList2.get(i));
                } // end of if
            } //end of for
        System.out.println(numberList3);       */
        
    } //end of main
} //end of class
