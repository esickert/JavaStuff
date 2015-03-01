import java.util.*;

public class UsingSet   {  
    public static void main(String[] args)  {

    ArrayList<Integer> numberList1 = new ArrayList<Integer>();
    ArrayList<Integer> numberList2 = new ArrayList<Integer>();

    Random randomGen = new Random();
    for (int i = 0; i < 5; i++)    {
        int randomInt = randomGen.nextInt(13);
        numberList1.add(randomInt);
    } // end of for loop             
    for (int i = 0; i < 7  ; i++) {
        int randomInt = randomGen.nextInt(15);
        numberList2.add(randomInt);
    } //end of for loop         */
    System.out.println("ArraylistA is " + numberList1);
    System.out.println("ArraylistB is " + numberList2);
    intersect(numberList1,numberList2);


    } // end of main

    public static ArrayList<Integer> intersect(ArrayList<Integer> listA, ArrayList<Integer> listB)  {
        ArrayList<Integer> listC = new ArrayList<Integer>();
        for (int i = 0; i < listA.size(); i++)  {
            for (int j = 0; j <  listB.size(); j++) {
                if (listA.get(i).equals(listB.get(j)))  
                    listC.add(listA.get(i));
            } //end of for loop
        } //end of for loop
        System.out.println("ArrayListC before duplicate " + listC);
        Set<Integer> setListC = new HashSet<Integer>(listC);
        System.out.println("After dupping: " + setListC);
        return listC;
    } // end of method intersect



} //end of class
