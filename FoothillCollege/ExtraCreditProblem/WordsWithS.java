/***********************************************************************/
/** Program Assignment 4 Part 1                      Erich Sickert 
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
        newList.add("twoS");
        newList.add("three");
        newList.add("four");
        newList.add("bugS");
        newList.add("flyS");

        capitalizePlurals(newList); //capitalizes plural words in an Arraylist
        removePlurals(newList);     //removes words ending with an "s"  in an ArrayList
          
        } //end of main

/***********************************************************************/
/** capitalizePlurals accepts an ArrayList of strings and replaces
/*  every word ending with an "s" with its uppercased version. 
/*
/***********************************************************************/
        public static void capitalizePlurals(ArrayList<String> arrayLs) {
            for (int i = 0; i < arrayLs.size(); i++) {
                String word = arrayLs.get(i);
                if (word.endsWith("s") || word.endsWith("S")) {
                    String temp = arrayLs.get(i).toUpperCase();
                    arrayLs.remove(i);
                    arrayLs.add(i,temp);
                    }  //end of if
            System.out.println(arrayLs.get(i));
            } //end of for loop
            System.out.println("*************************"); //used to separate output
        } //end of capitalizePlurals

/***********************************************************************/
/**  removePlurals that accepts an ArrayList of strings and removes
/*   every word in the list ending with an "s", case-insensitively
/*
/***********************************************************************/
                          
        public static void removePlurals(ArrayList<String> anotherList) {
            for (int i = 0; i < anotherList.size(); i++) {
                String word = anotherList.get(i);
                if (word.endsWith("s") || word.endsWith("S")) {
                    anotherList.remove(i);
                    i--;
                }  //end of if
            } //end of for loop
            for (int i = 0; i < anotherList.size(); i++) {
                System.out.println(anotherList.get(i)); 
            }
            System.out.println("*************************"); //used to separate output

        } //end of removePlurals                  
} //end of class WordsWithS


/* OUTPUT:

ONES
TWOS
three
four
BUGS
FLYS
*************************
three
four
*************************

*/


