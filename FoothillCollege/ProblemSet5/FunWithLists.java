import java.util.*;

public class FunWithLists {                        //don't forget the class word!!!
    public static void main(String[] args)  {

        ArrayList<Integer> numberList1 = new ArrayList<Integer>();
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
//  [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
/*        
        numberList1.add(1);
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
        numberList2.add(81);         */

        Random randomGen = new Random();
        for (int i = 0; i < 7; i++)    {
            int randomInt = randomGen.nextInt(15);
            numberList1.add(randomInt);
          } // end of for loop             
        for (int i = 0; i < 11  ; i++) {
            int randomInt = randomGen.nextInt(15);
            numberList2.add(randomInt);
        } //end of for loop         
        System.out.println("ArraylistA is " + numberList1);
        System.out.println("ArraylistB is " + numberList2);
        System.out.println("ArraylistC after checking for duplicates is "
                          + intersect(numberList1,numberList2));
    } //end of main

    public static ArrayList<Integer> intersect(ArrayList<Integer> listA, ArrayList<Integer> listB)  {
        ArrayList<Integer> listC = new ArrayList<Integer>();
        for (int i = 0; i < listA.size(); i++)  {
            for (int j = 0; j <  listB.size(); j++) {
                if (listA.get(i) == listB.get(j))  
                    listC.add(listA.get(i));
            } //end of for loop
        } //end of for loop
        System.out.println("ArrayListC before duplicate " + listC);
        try
        {
        for (int i = 0; i < listC.size(); i++)  {  //checks for duplicate entries 
            for( int j = 0; j < listC.size(); j++) {
                if (i == j)
                    continue;
                else if (listC.get(i) == listC.get(j)) {       
                   listC.remove(j);
                } //end of if
            } //end of for loop
        } // end of for loop
        }  
        catch (IndexOutOfBoundsException e)    //Okay sometimes it would throw
        {                                      //an exception but would work right after
        System.out.println("OUCH!! That hurt!!!");
        }
        return listC;
    } //end of intersect

} //end of FunWithLists

/*OUTPUT:

ArraylistA is [10, 13, 0, 7, 1, 0, 10]
ArraylistB is [12, 7, 13, 8, 1, 11, 6, 5, 10, 5, 10]
ArrayListC before duplicate [10, 10, 13, 7, 1, 10, 10]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
	at java.util.ArrayList.rangeCheck(ArrayList.java:635)
	at java.util.ArrayList.get(ArrayList.java:411)
	at FunWithLists.intersect(FunWithLists.java:63)
	at FunWithLists.main(FunWithLists.java:45)
*/
