import java.util.*;

public class AnArrayList    {
    public static void main(String[] args)  {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Tom");
        myList.add("Dick");
        myList.add("Harry");
        myList.add("Mary");
        myList.add("Jane");
        myList.add("Betty");

        for(int i = 0; i < myList.size(); i++)  {   
            System.out.println(myList.get(i));
            System.out.println(myList.size());
            String name = myList.get(0);
            System.out.println(name.length());
            System.out.println(myList.get(1));
        } //end of for loop
    } //end of main
} //end of class AnArrayList
