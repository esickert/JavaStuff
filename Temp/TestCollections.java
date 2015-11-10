import java.util.*;

public class TestCollections   {
    public static void main(String[] args)  {
      List<String> test = new LinkedList<String>();  //Don't forget the wrapper type. These all come from collections.
      test.add("This is a test");
      test.add("me too");
      test.add("and me");
      System.out.println(test.get(1) + "    This is line 9");

      List<String> test2 = new ArrayList<String>();
      test2.add("sortThis");
      test2.add("and This too");
      test2.add("hello");

      test.addAll(test2);
      for (int i = 0; i <= test.size() - 1; i++)    {
          System.out.println(test.get(i));
      }
    }
}
