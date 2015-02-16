/* ArrayList Exercises Slide 19+ of Presentation
   Mr. Bergquist
   AP CS Spring 2013
   Various Exercises to demonstrate power of ArrayLists
*/

   import java.util.*;  // for the Scanner
   import java.io.*;    // for FileIO exceptions

   public class ArrayListFun {         
      public static void main(String[] args) throws FileNotFoundException {
      
         Scanner input = new Scanner(new File("Raven2Stanza.txt"));
               
			System.out.println("By Array, the words");
			String[] arrayWords = new String[1000];
         int wordCount = 0;
         while (input.hasNext()) {
            String word = input.next();
            arrayWords[wordCount] = word;
            wordCount++;
         }
			System.out.println(Arrays.toString(arrayWords));
			
			// Now display them in Reverse Order?  Using our Array...
			System.out.println("Reverse Order from an Array");
			System.out.print("[");
			for (int i = wordCount-1; i >= 0; i--){
				System.out.print(arrayWords[i] + ", ");
			}
			System.out.println("] The End");
			System.out.println();
			
			
			// On to do this with ArrayLists
			// First display all words.
			input = new Scanner(new File("Raven2Stanza.txt"));
			System.out.println("By ArrayList, the words");
			ArrayList<String> allWords = new ArrayList<String>();
			while (input.hasNext()) {
    			String word = input.next();
    			allWords.add(word);
			}
			System.out.println(allWords);
			
			// Then display them in reverse order.
			System.out.println("Reverse Order");
			ArrayList<String> ReverseWords = new ArrayList<String>();
			for (int i = allWords.size() - 1; i >= 0; i--){
				ReverseWords.add(allWords.get(i));
			}
			System.out.println(ReverseWords);

						
			// Then display them with all plurals (ending in "s") capitalized.
			System.out.println("Capitalize all Plural words (ending in 's')");
			ArrayList<String> CapEndS = new ArrayList<String>();
			for (int i = 0; i < allWords.size(); i++){
		    	String word = allWords.get(i);
				if (word.endsWith("s")) {
        			CapEndS.add(allWords.get(i).toUpperCase());
    			} else {
					CapEndS.add(allWords.get(i));
				}
			}
			System.out.println(CapEndS);

			// Then display them with all plural words removed.
			System.out.println("Remove all Plural words (ending in 's')");
			for (int i = 0; i < allWords.size(); i++) {
    			String word = allWords.get(i);
    			if (word.endsWith("s")) {
        			allWords.remove(i);
        			i--;
    			}
			}
			System.out.println(allWords);
      	
      }
   	
   }
