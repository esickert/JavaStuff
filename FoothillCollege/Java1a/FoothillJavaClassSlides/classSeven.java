import java.util.*;

public class classSeven {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.
        System.out.println(strings.size());
//        
//        Scanner in = new Scanner(System.in);
//        System.out.println("This program reverses a string.");
//        System.out.print("Enter a string:  ");
//        String userInput = in.next();
//        
//        String reversedResult = reverseStringBackwardsOrder(userInput);
//        System.out.println(userInput + " spelled backwards is "+ reversedResult);

    }
    
    public static String reverseStringBackwardsOrder(String str) {
        
        char[] strArray = str.toCharArray();
        
        char[] backwards = new char[str.length()];
        
        for(int index=strArray.length-1; index>-1; index--) {
            char c = strArray[index];
            backwards[strArray.length-index-1] = c;
        }
        
        String backwardsString;
        backwardsString = new String(backwards);
        return backwardsString;
    }
    
    public static String reverseString(String str) {
        String backwards = "";
        
        char[] charArray = str.toCharArray();
        char[] reversedArray = new char[str.length()];
//        char[] reversedArray = new char[charArray.length];
          
          for(int index = 0; index< charArray.length; index++) {
              char c = charArray[index];
              reversedArray[charArray.length-1-index] = c;
          }
        
        backwards = new String(reversedArray);    

        return backwards;
    }

}
 

 

public static void main(String[] args) {
    // TODO Auto-generated method stub
    String apple = "apapalpe";
    System.out.println(apple.indexOf('p',2));
    
//  System.out.println(indexOf(apple, 'l'));

}

public static int indexOf(String look, char s) {
    //loop - go through every character in string see if the characters are equal to s
    // if no match, we want to return -1
    
    int match = -1;
    
    //for loop - because the string I am looking at has a limited number of characters
    char[] chararray= look.toCharArray();
    
    for(int index=0; index< chararray.length; index++) {
        //to check every character in the character array
        char compare = chararray[index];
        if(compare == s) {
            match = index;
            break;
        }
        //see if its equal to character we are looking for
        //if it is make match the index of that character

    }
    
    return match;
    
    

}
