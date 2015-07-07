import java.util.*;

public class TestStringClasses  {

    public static void main(String[] args)  {

    ArrayList<String> a = new ArrayList<String>(10);  //this is setting the arrayLists initial capacity
    System.out.println(a.size());
    for(int i = 0; i < 5; i++) {   
        a.add(i, "Hello there! Using an ArrayList!!");  //.add is a method of the ArrayList class
    }
    for(int i = 0; i <= a.size() - 1; i++) {
        System.out.println(a.get(i));  //.get is a method of the ArrayList class. Prints the above!!
    }
    
    Character character  = new Character('q'); //char is a primitive data type wrapped in a Character class
    System.out.println(character);
    boolean b = character.isDigit('m');
    System.out.println(a);

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
/** StringTokenizer class **/
 


    }
}
