import java.util.*;

public class TestMultiClasses  {

    public static void main(String[] args)  {

    ArrayList<String> a = new ArrayList<String>(3);  //this is setting the arrayLists initial capacity
    System.out.println(a.size());
    for(int i = 0; i <= 3; i++) {   
        a.add(i, "Hello there! Using an ArrayList!!");  //.add is a method of the ArrayList class
    }
//    System.out.println(a.size());
//    for(int i = 0; i <= a.size() - 1; i++) {
//        System.out.println(a.get(i));  //.get is a method of the ArrayList class. Prints the above!!
//    }
    
    StringClasses tester = new StringClasses();  //this is weird, using gthe StringClass!!
    tester.printAList(a);  // a is an arraylist
    
    Ch character  = new Ch('z'); //char is a primitive data type wrapped in a Character class
//    System.out.println("line 21 " +character);
//    boolean b = character.isDigit('m');
//    System.out.println(a);
    character.printCharac();
/********************************************************************/
/** StringBuffer class...very cool!!      **/
    StringBuffer me = new StringBuffer(0);   //StringBuffer is a class
    me.append("Talk about an easy way to reverse a string");
    System.out.println(me);
    me.reverse();
    System.out.println(me); //talk about an easy way to reverse a string
 
/** Need to understand StringBuffer better!!!!!!!!!!! StringBuffer and how they relate to Strings **/

    StringBuffer test = new StringBuffer("amenicycinema");
    StringBuffer erich = new StringBuffer("amenicycinema");
//    StringBuffer erich = test;
    System.out.println(erich + "line 33");
    
    StringBuffer pali = new StringBuffer();
    pali = test.reverse(); //test is reversed here!!!
    System.out.println(test + " reversed line 37");
    System.out.println(pali + " line 38");
    System.out.println(erich + " line 39");  //my logic is all fucked up!!  Why is this reversed??
    
    boolean isPalindrone = test.toString().equals(erich.toString());   //this works now!!!
    System.out.println("Is " + test + " and " + erich + " a palindrone??:" + isPalindrone); //this now works!!!

/**********************************************************************/
/** StringTokenizer class - don't use this (retired??). These are extra classes from the api for string manipulation **/
/** StringBuilder class    //"overkill" of the StringBuffer class      **/
/** So I want to play with arraylits and stringbuffers!!!!!!      **/


    }
}
