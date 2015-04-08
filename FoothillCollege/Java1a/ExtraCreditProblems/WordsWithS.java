/***********************************************************************/
/** Extra Credit Array Question 2                      Erich Sickert 
/*  The class WordsWithS has 2 method calls. One is to
/*  capitalizePlurals(newList) and the other is removePlurals(newList).
/*  It is used to run and demonstate the two methods. newList is an
/*  ArrayList with string elements. The line of stars (*) is just used
/*  to separate the output.
/***********************************************************************/ 

import java.util.*;

public class WordsWithS	{
    public static void main(String[] args)	{
    
        ArrayList<String> newList = new ArrayList<String> ();
           
        newList.add("Ones");
        newList.add("two");
        newList.add("threeS");
        newList.add("four");
        newList.add("bug");
        newList.add("fly");

        System.out.println(newList);
        System.out.println("*************************"); //used to separate output
        System.out.println(capitalizePlurals(newList));  //capitalizes plural words in an Arraylist
        System.out.println("*************************"); //used to separate output
        System.out.println(removePlurals(newList));      //removes words ending with an "s"  in an ArrayList
          
        } //end of main

/***********************************************************************/
/** capitalizePlurals accepts an ArrayList of strings and replaces
/*  every word ending with an "s" with its uppercased version. It then
/*  returns said ArrayList.
/***********************************************************************/
        public static ArrayList<String> capitalizePlurals(ArrayList<String> arrayLs) {
            for (int i = 0; i < arrayLs.size(); i++) {
                String word = arrayLs.get(i);
                if (word.endsWith("s") || word.endsWith("S")) {
                    String temp = arrayLs.get(i).toUpperCase();
                    arrayLs.remove(i);
                    arrayLs.add(i,temp);
                    }  //end of if
            } //end of for loop
            return arrayLs;
        } //end of capitalizePlurals

/***********************************************************************/
/**  removePlurals takes an ArrayList of strings and removes
/*   every word in the list ending with an "s", case-insensitively.
/*   It then returns said ArrayList.
/***********************************************************************/
                          
        public static ArrayList<String> removePlurals(ArrayList<String> anotherList) {
            for (int i = 0; i < anotherList.size(); i++) {
                String word = anotherList.get(i);
                if (word.endsWith("s") || word.endsWith("S")) {
                    anotherList.remove(i);
                    i--;
                }  //end of if
            } //end of for loop
            return anotherList;
        } //end of removePlurals                  

} //end of class WordsWithS





