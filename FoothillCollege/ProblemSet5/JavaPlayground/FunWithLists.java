import java.util.*;

public class FunWithLists {                        //don't forget the class word!!!
    public static void main(String[] args)  {

        ArrayList<Integer> numberList1 = new ArrayList<Integer>();
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
//              [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
        
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
 //             [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
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
        for (int i = 0; i < 10; i++)    {
            int randomInt = randomGen.nextInt(15);
            numberList1.add(randomInt);
          } // end of for loop             
        for (int i = 0; i < 11  ; i++) {
            int randomInt = randomGen.nextInt(15);
            numberList2.add(randomInt);
        } //end of for loop              
        System.out.println("listC before duplicates is " + intersect(numberList1,numberList2));
//        System.out.println(intersect(numberList1,numberList2));
        System.out.println("listC is after duplicates is " + duplicate(intersect(numberList1,numberList2)));
    } //end of main

    public static ArrayList<Integer> intersect(ArrayList<Integer> listA, ArrayList<Integer> listB)  {
        ArrayList<Integer> listC = new ArrayList<Integer>();
        System.out.println("listA is " + listA);   //this is printing out Arraylist listA
        System.out.println("listB is " + listB);   //this is printing out ArrayList listB
        for (int i = 0; i < listA.size(); i++)  {
            for (int j = 0; j <  listB.size(); j++) {
                if (listA.get(i) == listB.get(j))  
                    listC.add(listA.get(i));
            } //end of for loop
        } //end of for loop
        return duplicate(listC);
        //return listC;
    } //end of intersect

/*************************************************************************************************/

    public static ArrayList<Integer> duplicate(ArrayList<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++)  {   
            for( int j = 1; j < numberList.size(); j++) {
                if (i == j)
                    continue;
                else if (numberList.get(i) == numberList.get(j)) {       
                   // System.out.println(numberList.get(i) + " and " + numberList.get(j));
                    numberList.remove(j);
                } //end of if
            } //end of for loop
        } // end of for loop
        return numberList;
    } //end of duplicates

} //end of FunWithLists
