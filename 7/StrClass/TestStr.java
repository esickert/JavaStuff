public class TestStr    {
    /** main method */
    public static void main(String[] args)  {
        char[] characters;
        char[] ch;

        Str testSample = new Str();

//  
        System.out.println(testSample.getString());    //this now return what the "this" constructor sets
        testSample.setString("world");
        System.out.println(testSample.getString());
        System.out.println(testSample.indexAt('z'));
        System.out.println(testSample.lastIndexAt('l'));
        System.out.println(testSample.convertStringToArray("reverse this string"));
        characters =  testSample.convertStringToArray("reverseaaa this string and again");
        System.out.println(characters[2]);
        ch = testSample.reverseArray(characters);
        System.out.println(ch);
        // note how this array is initialized!! then it's convert into a string
        String str = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str);
        str = testSample.convertArrayToString(ch);
        System.out.println(str);
        str = testSample.convertArray(characters);
        System.out.println("line 26 " + str);
        System.out.println("Is a palindrome: " + testSample.isPalindrome(str,"test"));
        char charac = 'a';
        System.out.println("The number of " + charac + "'s " + " is "
                        + testSample.countNumberOfCharacters(characters, charac));
        
    }
}
